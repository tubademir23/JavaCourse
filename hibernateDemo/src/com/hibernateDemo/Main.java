package com.hibernateDemo;

import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		Session session =factory.getCurrentSession();
		try {
			session.beginTransaction();
			//HQL-> hibernate query language
			/*Querying
			 * 
			 * List<String> cities=session.createQuery("select c.countryCode from City c where c.name like 'A%' group by c.countryCode").getResultList();
			
			for(String city:cities) {
				System.out.println(city);
			}*/
			/*
			 * inserting
			City city=new City(4080,"test city","TUR", "Test city",5000000);
			session.save(city);
			System.out.println("city added");
			*/
			City city=session.get(City.class, 4080);
			city.setCountryCode("SUR");
			session.getTransaction().commit();
			System.out.println("city updated "+ city.getCountryCode());
		}finally {
			factory.close();
		}
	}

}
