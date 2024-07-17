package com.criteria;

import com.operation.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaSelectSingleColumn {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select *from book;
		Criteria c = session.createCriteria(Book.class);
		c.add(Restrictions.gt("price", 400));
		Projection p1 = Projections.property("bname");
		c.setProjection(p1);
		
		List<String> list = c.list();
		for (String s : list) {
			System.out.println(s);
		}

	}

}
