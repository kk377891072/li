package test;

import java.util.List;

import com.nnn.dzr.dao.UserDao;
import com.nnn.dzr.entity.User;

public class Test {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		List<User> list= dao.getList();
		
		for (User user : list) {
			System.out.println(user.getCard().getId());
		}
		
		
	}

}
