package com.onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultySubjectMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Faculty.class);
		cfg.addAnnotatedClass(FacultySubject.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		//Faculty f1 = new Faculty("sonali");
		Faculty f2 = new Faculty("Amruta");
		FacultySubject s1 = new FacultySubject("Testing");
		FacultySubject s2 = new FacultySubject("AWS");
		//FacultySubject s3 = new FacultySubject("Mern");
		//FacultySubject s4 = new FacultySubject("Mean");

		ArrayList<FacultySubject> slist = new ArrayList<FacultySubject>();
		slist.add(s1);
		slist.add(s2);
		//slist.add(s3);
		f2.setFsubList(slist);
		session.save(f2);
		session.save(s1);
		session.save(s2);
		//session.save(s3);
		transaction.commit();
		session.close();
		System.out.println("Process done...");
	}

}
