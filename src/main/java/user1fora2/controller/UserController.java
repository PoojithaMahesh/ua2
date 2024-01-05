package user1fora2.controller;

import user1fora2.dao.UserDao;
import user1fora2.dto.User;

public class UserController {

	public static void main(String[] args) {
		
//		User user=new User();
//		user.setId(2);
//		user.setName("Raja");
//		user.setAddress("Bangalore");
//		
//		
//		UserDao userDao=new UserDao();
//		userDao.saveUser(user);
		
//		FIND
		UserDao userDao=new UserDao();
		userDao.findUser(1);
//		userDao.deleteUser(1);
		
//		User user=new User();
//		user.setName("soundarya");
//		user.setAddress("Bidar");
//		
//		UserDao userDao=new UserDao();
//		userDao.updateUser(1,user);
		
		
	}
}