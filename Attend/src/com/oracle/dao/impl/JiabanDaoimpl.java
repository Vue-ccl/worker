package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.oracle.dao.JiabanDao;
import com.oracle.model.Jiaban;
import com.oracle.utils.DBUtilsPro;
import com.oracle.utils.StringUtils;

public class JiabanDaoimpl implements JiabanDao {

	@Override
	public List<Vector> selectAllJiaban(Jiaban jiab, int ID) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from jiaban where id=?");
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
				v.add(rs.getString(6));
				
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
	public List<Vector> selectAllJiabans(Jiaban jiab) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from jiaban where 1=1  ");

			if (!StringUtils.isEmpty(Integer.toString(jiab.getId())) && jiab.getId() != 0) {
				sql.append("  and id =  " + jiab.getId());
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
				v.add(rs.getString(6));
				
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
	public int deleteJiaban(String jd) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("delete from jiaban where jd=?");

			ps.setInt(1, Integer.parseInt(jd));

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
	public int updataJiaban(Jiaban jiab) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();
			System.out.println(jiab);

			ps = connection.prepareStatement("update jiaban set stime=?,endtime=?,sumtime=?,dday=? where jd=?");

			
			ps.setString(1, jiab.getStime());
			ps.setString(2, jiab.getEndtime());
			ps.setInt(3, jiab.getSumtime());
			ps.setString(4, jiab.getDday());
			ps.setInt(5, jiab.getJd());

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
	public int adddate(Jiaban jiaban) {
		Connection connection = null;
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("insert into jiaban values (?,?,?,?,?)");

			ps.setInt(1, jiaban.getId());
			ps.setString(2, jiaban.getStime());
			ps.setString(3, jiaban.getEndtime());
			ps.setInt(4, jiaban.getSumtime());
			ps.setString(5, jiaban.getDday());
			
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
