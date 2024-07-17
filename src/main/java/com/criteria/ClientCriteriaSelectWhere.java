package com.criteria;

import com.operation.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaSelectWhere {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select *from book;
		Criteria c = session.createCriteria(Book.class);
		// select *from book where bname = 'Python';
		//c.add(Restrictions.eq("bname", "Python"));
		
		// select *from book where price = 900;
		//c.add(Restrictions.eq("price", 900));
		
		//greater than
		//c.add(Restrictions.gt("price", 400));
		
		//less than 
		//c.add(Restrictions.lt("price", 400));
		
		//between
		//c.add(Restrictions.between("price", 400, 600));
		
		//like
		c.add(Restrictions.ilike("bname", "python"));
		List<Book> list = c.list();
		for (Book b : list) {
			System.out.println(b);
		}

	}

}
