package com.service;

import com.dao.BaseDao;
import com.dao.UserDao;
import com.model.User;

public class UserService {
	private BaseDao userDAO=new UserDao();
	
	public BaseDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(BaseDao userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u){
		this.userDAO.save(u);
	}
}
