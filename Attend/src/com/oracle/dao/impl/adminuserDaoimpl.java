package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.oracle.dao.adminuserDao;
import com.oracle.model.adminuser;
import com.oracle.utils.DBUtilsPro;
import com.oracle.utils.StringUtils;

public class adminuserDaoimpl implements adminuserDao {

	@Override
	public adminuser login(String username) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		adminuser a = null;

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from adminuser where username=?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				// a=new adminuser();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String sex = rs.getString(3);
				String age = rs.getString(4);
				String prof = rs.getString(5);
				String username1 = rs.getString(6);
				String password = rs.getString(7);
				String root = rs.getString(8);
				a = new adminuser(id, name, sex, age, prof, username1, password, root);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps, rs);
		}
		return a;
	}

	@Override
	public boolean validateUserName(String username) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean flag = false;

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("select * from adminuser where username=?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				// 如果用户名存在
				flag = true;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtilsPro.close(connection, ps, rs);
		}
		return flag;
	}

	@Override
	public int register(adminuser admins) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;

		int i = 0;

		try {
			connection = DBUtilsPro.getConnection();
			ps = connection.prepareStatement("insert into adminuser values (?,?,?,?,?,?,?)");

			ps.setString(1, admins.getName());
			ps.setString(2, admins.getSex());
			ps.setString(3, admins.getAge());
			ps.setString(4, admins.getProf());
			ps.setString(5, admins.getUsername());
			ps.setString(6, admins.getPassword());
			ps.setString(7, admins.getRoot());
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
	public List<Vector> selectAlladminuser(adminuser admin) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Vector> list = new ArrayList<Vector>();

		try {
			connection = DBUtilsPro.getConnection();
			StringBuilder sql = new StringBuilder("select * from adminuser where 1=1");
			if (!StringUtils.isEmpty(admin.getName())) {
				sql.append("  and name like '%" + admin.getName() + "%' ");
			}

			System.out.println(sql.toString());
			ps = connection.prepareStatement(sql.toString());

			rs = ps.executeQuery();
			while (rs.next()) {
				// a=new adminuser();
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getInt(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
				v.add(rs.getInt(8));
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
	public int deleteWorkers(String id) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("delete from adminuser where id=?");

			ps.setInt(1, Integer.parseInt(id));

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
	public int updataWorkers(adminuser adminuser) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();
			System.out.println(adminuser);

			ps = connection.prepareStatement("update adminuser set name=?,sex=?,age=?,prof=?,username=?,password=?,root=? where id=?");

			ps.setString(1, adminuser.getName());
			ps.setString(2, adminuser.getSex());
			ps.setString(3, adminuser.getAge());
			ps.setString(4, adminuser.getProf());
			ps.setString(5, adminuser.getUsername());
			ps.setString(6, adminuser.getPassword());
			ps.setString(7, adminuser.getRoot());
			ps.setInt(8, adminuser.getId());

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
	public int updatePwd(String password, String user_name) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = DBUtilsPro.getConnection();

			ps = connection.prepareStatement("update adminuser set password=? where username=?");

			ps.setString(1, password);
			ps.setString(2, user_name);
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
