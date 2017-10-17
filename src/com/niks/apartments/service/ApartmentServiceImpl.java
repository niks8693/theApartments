package com.niks.apartments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niks.apartments.dao.ApartmentDao;
import com.niks.apartments.pojo.Apartment;

@Service
public class ApartmentServiceImpl implements ApartmentService {
	
	@Autowired
	private ApartmentDao apartmentDao;

	@Override
	@Transactional
	public void saveApartment(Apartment apartment) {
		apartmentDao.saveApartment(apartment);
		
	}

}
