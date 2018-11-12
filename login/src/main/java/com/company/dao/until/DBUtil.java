package com.company.dao.until;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.stereotype.Component;

@Component("dbutil")
public class DBUtil {
	private static DataSource c3p0DataSource = new ComboPooledDataSource("test_c3p0");
	//连接池
	public static DataSource getC3p0DataSource(){
		return c3p0DataSource;
	}
	public static Connection getConnection(){
		Connection con=null;
		try {
			con=c3p0DataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void close(ResultSet rs,PreparedStatement ps,Connection con){
		try {
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
		} catch (Exception e) {
		}
	}
}
