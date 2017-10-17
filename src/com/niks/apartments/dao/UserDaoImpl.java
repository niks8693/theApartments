package com.niks.apartments.dao;

import java.util.List;

import javax.persistence.Query;

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

	@Override
	public boolean authenticateUser(String username, String password) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User as u where u.username=? and u.password=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		
		List<User> list=query.getResultList();
		System.out.println("User found using authenticateUser()-->"+ list);
		if(list!=null && list.size()>0){
			return true;
		}
		else{
			return false;
		}
	}

}
