package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;
@Repository
public class HbernateCityDal implements ICityDal{

	private EntityManager entityManager;
	
	@Autowired
	public HbernateCityDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	//AOP: Aspect Orianted Programming-code build olunca arkasına transaction koyuyor.
	@Override
	@Transactional
	public List<City> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<City> cities=session.createQuery("from city", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
