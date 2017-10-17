package com.niks.apartments.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niks.apartments.pojo.Apartment;

@Repository
public class ApartmentDaoImpl implements ApartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveApartment(Apartment apartment) {
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Apartment being saved using saveApartment()-->"+apartment.toString());
		session.save(apartment);
		System.out.println("Apartment Saved");
		
	}

}
