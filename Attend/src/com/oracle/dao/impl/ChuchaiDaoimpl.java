package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.oracle.dao.ChuchaiDao;
import com.oracle.model.Chuchai;
import com.oracle.utils.DBUtilsPro;
import com.oracle.utils.StringUtils;

public class ChuchaiDaoimpl implements ChuchaiDao {

	@Override
	public List<Vector> selectAllChuchai(Chuchai chuc, int ID) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from chuchai where id=?");
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
	public List<Vector> selectAllChuchais(Chuchai chuc) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from chuchai where 1=1  ");

			if (!StringUtils.isEmpty(Integer.toString(chuc.getId())) && chuc.getId() != 0) {
				sql.append("  and id =  " + chuc.getId());
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
	public int deleteChuchai(String cd) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("delete from chuchai where cd=?");

			ps.setInt(1, Integer.parseInt(cd));

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
	public int updataChuchai(Chuchai chuc) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();
			System.out.println(chuc);

			ps = connection.prepareStatement("update chuchai set stime=?,endtime=?,sumtime=? where cd=?");

			
			ps.setString(1, chuc.getStime());
			ps.setString(2, chuc.getEndtime());
			ps.setInt(3, chuc.getSumtime());
		
			ps.setInt(4, chuc.getCd());

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
	public int adddate(Chuchai chuchai) {
		Connection connection = null;
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("insert into chuchai values (?,?,?,?)");

			ps.setInt(1, chuchai.getId());
			ps.setString(2, chuchai.getStime());
			ps.setString(3, chuchai.getEndtime());
			ps.setInt(4, chuchai.getSumtime());
			
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
