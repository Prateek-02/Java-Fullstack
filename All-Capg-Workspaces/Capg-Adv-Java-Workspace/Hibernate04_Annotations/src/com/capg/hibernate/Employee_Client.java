package com.capg.hibernate;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Employee_Client {

	public static void main(String[] args) {
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure("hibernate_annotation.cfg.xml");
		
		SessionFactory sessionFactory = acfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			Employee e = new Employee();
			e.setFirstName("Ishan");
			e.setLastName("Kishan");
			e.setSalary(7000);
			
			session.save(e);
			tx.commit();
		}
		catch(HibernateException e) {
			tx.rollback();
			System.out.println("Exception while creating employee: "+e);
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

}
