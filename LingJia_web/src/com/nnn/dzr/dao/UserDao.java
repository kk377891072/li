package com.nnn.dzr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nnn.dzr.entity.Card;
import com.nnn.dzr.entity.User;



public class UserDao extends BaseDao{


	public List<User> getList(){
		List<User> list = new ArrayList<>();
		ResultSet rs = executeQuery("select * from user_info",null);
		try {
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getString(1));
				user.setName(rs.getString(2));
				user.setAddress(rs.getString(3));
				user.setCard(new Card(rs.getString("card_id")));
				list.add(user);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		

		
	}
	
}
