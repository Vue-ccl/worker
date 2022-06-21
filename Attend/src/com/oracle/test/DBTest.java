package com.oracle.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.oracle.utils.DBUtilsPro;

public class DBTest {
	@Test
	public void testConn() throws SQLException {
		Connection conn=DBUtilsPro.getConnection();
		System.out.println(conn);
	}

}