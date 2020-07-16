package com.xworkz.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import com.xworkz.spring.dto.CalamityDTO;

@Component
public class CalamityDAOImpl implements CalamityDAO {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void save(CalamityDTO dto) {
		System.out.println("Start : daoImpl");
		System.out.println("invoked save() method in daoImpl");
		System.out.println(dto);
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End : daoImpl");

		} catch (Exception e) {
			System.out.println("unable to insert");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
