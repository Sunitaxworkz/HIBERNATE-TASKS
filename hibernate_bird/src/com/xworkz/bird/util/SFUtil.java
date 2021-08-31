package com.xworkz.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;

	}

	static {

		System.out.println("SF INIT Started");
		Configuration config = new Configuration().configure();
		factory = config.buildSessionFactory();
		System.out.println("SF INIT COMPLETE");
	}

}
