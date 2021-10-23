package com.example.hibernateSample3.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernateSample3.entity.Person;
import com.example.hibernateSample3.util.HibernateUtil;

public class PersonDao {
	
	public void savePerson(Person person) {
		Transaction transaction = null;
		
		try {
			System.out.println("Saving Person...");
			 Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
		
			session.save(person);
			transaction.commit();
			
		} catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
			
		}
	}
	
	public Person getPerson(Long id) {
		Transaction transaction = null;
		Person person = null;
		try {
			 Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
		
		
			person = session.get(Person.class, id);
			
			
			transaction.commit();
			
		} catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
			
		}
		
		return person;
	}
	
	
}
