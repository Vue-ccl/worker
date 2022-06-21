package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.oracle.dao.QingjiaDao;
import com.oracle.model.Qingjia;
import com.oracle.utils.DBUtilsPro;
import com.oracle.utils.StringUtils;

public class QingjiaDaoimpl implements QingjiaDao {

	@Override
	public List<Vector> selectAllQingjia(Qingjia qingj, int ID) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from qingjia where id=?");
			ps.setInt(1,ID);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				// a=new adminuser();
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getInt(5));
				list.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps, rs);
		}
		return list;
	}

	@Override
	public List<Vector> selectAllQingjias(Qingjia qingj) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from qingjia where 1=1  ");

			if (!StringUtils.isEmpty(Integer.toString(qingj.getId())) && qingj.getId() != 0) {
				sql.append("  and id =  " + qingj.getId());
			}
			System.out.println(sql.toString());

			ps = connection.prepareStatement(sql.toString());
			
			rs = ps.executeQuery();
			while (rs.next()) {
				// a=new adminuser();
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getInt(5));
				
				list.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps, rs);
		}
		return list;
	}

	@Override
	public int deleteQingjia(String qd) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("delete from qingjia where qd=?");

			ps.setInt(1, Integer.parseInt(qd));

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps);
		}
		return i;
	}

	@Override
	public int updataChuchai(Qingjia qingj) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();
			System.out.println(qingj);

			ps = connection.prepareStatement("update qingjia set stime=?,endtime=?,sumtime=? where qd=?");

			
			ps.setString(1, qingj.getStime());
			ps.setString(2, qingj.getEndtime());
			ps.setInt(3, qingj.getSumtime());
		
			ps.setInt(4, qingj.getQd());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps);
		}
		return i;
	}

	@Override
	public int adddate(Qingjia qingjia) {
		Connection connection = null;
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("insert into qingjia values (?,?,?,?)");

			ps.setInt(1, qingjia.getId());
			ps.setString(2, qingjia.getStime());
			ps.setString(3, qingjia.getEndtime());
			ps.setInt(4, qingjia.getSumtime());
			
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps);
		}
		return i;
	}

}
