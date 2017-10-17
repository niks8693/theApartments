package com.niks.apartments.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niks.apartments.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Saving user from UserDao.saveUser()-->"+user.toString());
		session.save(user);
		System.out.println("User saved");
	}

}
