package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.oracle.dao.ChuqinDao;
import com.oracle.model.Chuqin;
import com.oracle.utils.DBUtilsPro;
import com.oracle.utils.StringUtils;

public class ChuqinDaoimpl implements ChuqinDao {

	@Override
	public List<Vector> selectAllChuqin(Chuqin chuq, int ID) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from chuqin where id=?");
			ps.setInt(1, ID);

			rs = ps.executeQuery();
			while (rs.next()) {
				// a=new adminuser();
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
				v.add(rs.getString(8));
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
	public List<Vector> selectAllQueqin(Chuqin chuq, int ID) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement(
					"select wd,id,uutime,untime,nutime,nntime,dday from chuqin where abcord='ÊÇ' and id=?");
			ps.setInt(1, ID);

			rs = ps.executeQuery();
			while (rs.next()) {
				// a=new adminuser();
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
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
	public List<Vector> selectAllChuqins(Chuqin chuq) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from chuqin where 1=1");

			if (!StringUtils.isEmpty(Integer.toString(chuq.getId())) && chuq.getId() != 0) {
				sql.append("  and id =  " + chuq.getId());
			}
			System.out.println(sql.toString());

			ps = connection.prepareStatement(sql.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				//
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
				v.add(rs.getString(8));
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
	public int deleteChuqin(String wd) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("delete from chuqin where wd=?");

			ps.setInt(1, Integer.parseInt(wd));

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
	public int updataChuqin(Chuqin chuq) {
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();
			System.out.println(chuq);

			ps = connection.prepareStatement("update chuqin set uutime=?,untime=?,nutime=?,nntime=?,abcord=?,dday=? where wd=?");

			
			ps.setString(1, chuq.getUutime());
			ps.setString(2, chuq.getUntime());
			ps.setString(3, chuq.getNutime());
			ps.setString(4, chuq.getNntime());
			ps.setString(5, chuq.getAbcord());
			ps.setString(6, chuq.getDday());
			ps.setInt(7, chuq.getWd());

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
	public int adddate(Chuqin chuqin) {
		Connection connection = null;
		PreparedStatement ps = null;
		int i = 0;
		
		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("insert into chuqin values (?,?,?,?,?,?,?)");

			ps.setInt(1, chuqin.getId());
			ps.setString(2, chuqin.getUutime());
			ps.setString(3, chuqin.getUntime());
			ps.setString(4, chuqin.getNutime());
			ps.setString(5, chuqin.getNntime());
			ps.setString(6, chuqin.getAbcord());
			ps.setString(7, chuqin.getDday());
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
	public List<Vector> selectAllQueqins(Chuqin chuq) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from chuqin where 1=1 and abcord='ÊÇ' ");

			if (!StringUtils.isEmpty(Integer.toString(chuq.getId())) && chuq.getId() != 0) {
				sql.append("  and id =  " + chuq.getId());
			}
			System.out.println(sql.toString());

			ps = connection.prepareStatement(sql.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				//
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getInt(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
				v.add(rs.getString(8));
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

}
