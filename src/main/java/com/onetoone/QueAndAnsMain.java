package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QueAndAnsMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Question q1 = new Question("What is Hibernate?");
		Answer a1 = new Answer(111, "Hibernate is ORM Tool");
		q1.setAnsid(a1);
		session.save(q1);
		tx.commit();
		session.close();
		System.out.println("Process done...");

	}

}
