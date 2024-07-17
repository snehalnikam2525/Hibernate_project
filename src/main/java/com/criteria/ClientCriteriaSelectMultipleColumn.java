package com.criteria;

import com.operation.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaSelectMultipleColumn {

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
		Projection p2 = Projections.property("author");
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		c.setProjection(plist);

		List<Object[]> list = c.list();

		for (Object[] s : list) {
			for (Object b : s) {
				System.out.println(b.toString());
			}

		}

	}

}
