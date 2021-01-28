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
			List<City> cities=session.createQuery("from City c where c.countryCode='TUR' and c.name like '%A%' order by c.name desc").getResultList();
			
			for(City city:cities) {
				System.out.println(city.getName());
			}
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}

}
