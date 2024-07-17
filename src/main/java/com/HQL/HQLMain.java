package com.HQL;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class HQLMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		Person p1 = new Person(111, "Rohit", 34000, "Pune");
//		Person p2 = new Person(222, "Ram", 40000, "Mumbai");
//		Person p3 = new Person(333, "Riya", 55000, "Nashik");
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);

		// select *from person
		// Query query = session.createQuery("from Person");

		// select specific column data
//		Query query = session.createQuery("select pname from Person");
//		List<String> plist = query.list();
//		for (String p : plist) {
//			System.out.println(p);
//		}

		// select * from person where city = "pune"
//		Query query = session.createQuery("from Person where city = :c");
//		query.setParameter("c", "Pune");
//		List<Person> plist = query.list();
//		for (Person p : plist) {
//			System.out.println(p);
//		}
		
		
		
		Query query = session.createQuery("from Person where city = :c AND sal > 25000");
		query.setParameter("c", "Pune");
		List<Person> plist = query.list();
		for (Person p : plist) {
			System.out.println(p);
		}
		tx.commit();
		session.close();
		System.out.println("Process done..");

	}
}
