package com.nnn.dzr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nnn.dzr.util.ConfigMapper;

public class BaseDao {

	private Connection conn;
	private PreparedStatement ppst;
	private ResultSet rs;

	// 获取数据库连接
	public Connection getConn() {
		try {
			// 1、加载驱动
			Class.forName(ConfigMapper.get("driver"));
			// 2、获取数据库连接
			String url = ConfigMapper.get("url");
			conn = DriverManager.getConnection(url, ConfigMapper.get("user"), ConfigMapper.get("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

	

	// 增删改(update,insert,delete)
	public String executeUpdate(String sql, Object... objects) {
		try {
			// 获取数据库连接
			ppst = getConn().prepareStatement(sql);
			// 给通配符赋值
			for (int i = 0; i < objects.length; i++) {
				ppst.setObject(i + 1, objects[i]);
			}
			// 执行sql
			ppst.executeUpdate();
			return "ok";
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close2();
		}
		return "error";
	}

	// 查询
	public ResultSet executeQuery(String sql, Object... objects) {
		try {
			// 获取数据库连接
			ppst = getConn().prepareStatement(sql);
			// 给通配符赋值
			if(objects!=null) {
				for (int i = 0; i < objects.length; i++) {
					ppst.setObject(i + 1, objects[i]);
				}
			}
			// 执行sql
			rs = ppst.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}


	// 关闭连接
	public void close1() {
		try {
			rs.close();
			ppst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 关闭连接
	public void close2() {
		try {
			ppst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
