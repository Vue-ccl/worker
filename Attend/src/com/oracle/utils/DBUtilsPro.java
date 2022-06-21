package com.oracle.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DBUtilsPro {
	private static DataSource dataSource;
	
	static {

		try {
			InputStream in = new FileInputStream("druid.properties");
			Properties p = new Properties();
			//加载配置文件，自动获取四大参数,可以通过数据源创建连接对象
			p.load(in);
			dataSource=DruidDataSourceFactory.createDataSource(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//返回数据源对象
	public static DataSource getDataSource() {
			return dataSource;
		}
	
	//通过数据库连接池，创建连接
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	/**
	 * 关闭结果集
	 * 
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭预处理对象
	 * 
	 * @param ps
	 */
	public static void closePreparedStatement(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭连接，归还连接给连接池
	 * 
	 * @param conn
	 */
	public static void closeConnnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 用于释放查询的资源
	 * 
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		closeResultSet(rs);
		closePreparedStatement(ps);
		closeConnnection(conn);
	}

	/**
	 * 用于释放增删改的资源
	 * 
	 * @param conn
	 * @param ps
	 */
	public static void close(Connection conn, PreparedStatement ps) {

		closePreparedStatement(ps);
		closeConnnection(conn);
	}
}
