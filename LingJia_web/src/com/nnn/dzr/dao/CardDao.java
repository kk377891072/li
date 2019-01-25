package com.nnn.dzr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nnn.dzr.entity.Card;
import com.nnn.dzr.entity.Energy;
import com.nnn.dzr.entity.Gas;
import com.nnn.dzr.entity.Property;
import com.nnn.dzr.entity.User;
import com.nnn.dzr.entity.Water;



public class CardDao extends BaseDao{


	public List<Card> getList(){
		List<Card> list = new ArrayList<>();
		ResultSet rs = executeQuery("select * from card",null);
		try {
			
			while(rs.next()) {
				Card card = new Card();
				card.setId(rs.getString(1));
				card.setUsername(rs.getString(2));
				card.setPassword(rs.getString(3));
				card.setGas(new Gas(rs.getString("gas_id")));
				card.setEnergy(new Energy(rs.getString("energy_id")));
				card.setWater(new Water(rs.getString("water_id")));
				card.setProperty(new Property(rs.getString("property_id")));
				list.add(card);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		

		
	}
	
}
