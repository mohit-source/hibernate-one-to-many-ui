package com.example.hibernateSample3.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernateSample3.entity.Phone;
import com.example.hibernateSample3.util.HibernateUtil;

public class PhoneDao {
		public void savePhone(Phone phone) {
			Transaction transaction = null;
			
			try {
				System.out.println("Saving Phone Details...");
				 Session session = HibernateUtil.getSessionFactory().openSession();
				transaction = session.beginTransaction();
				session.save(phone);
				transaction.commit();
				
			} catch(Exception e) {
				
				if(transaction != null) {
					transaction.rollback();
				}
				
				e.printStackTrace();
				
			}
		}
		
		
		public void updatePhone(Phone phone) {
			Transaction transaction = null;
			try {
				 Session session = HibernateUtil.getSessionFactory().openSession();
				transaction = session.beginTransaction();
			
				session.update(phone);
				transaction.commit();
				
			} catch(Exception e) {
				
				if(transaction != null) {
					transaction.rollback();
				}
				
				e.printStackTrace();
				
			}
			
		}
		
		public void deletePhone(int id) {
			Transaction transaction = null;
			try {
				 Session session = HibernateUtil.getSessionFactory().openSession();
				transaction = session.beginTransaction();
			
			
				Phone phone = session.get(Phone.class, id);
				if(phone != null) {
					session.delete(phone);
					System.out.println("Phone is deleted");
				}
				
				transaction.commit();
				
			} catch(Exception e) {
				
				if(transaction != null) {
					transaction.rollback();
				}
				
				e.printStackTrace();
				
			}
			
		}
		
		public Phone getPhone(Long id) {
			Transaction transaction = null;
			Phone phone = null;
			try {
				 Session session = HibernateUtil.getSessionFactory().openSession();
				transaction = session.beginTransaction();
			
			
				 phone = session.get(Phone.class, id);
				
				
				transaction.commit();
				
			} catch(Exception e) {
				
				if(transaction != null) {
					transaction.rollback();
				}
				
				e.printStackTrace();
				
			}
			
			return phone;
		}
}
