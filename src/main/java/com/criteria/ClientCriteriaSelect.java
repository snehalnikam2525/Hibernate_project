package com.criteria;

import com.operation.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientCriteriaSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select *from book
		Criteria c = session.createCriteria(Book.class);
		List<Book> list = c.list();
		for (Book b : list) {
			System.out.println(b);
		}

	}

}
