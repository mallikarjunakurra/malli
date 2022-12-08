package com.jdbc.Lab_Test_on_Hibernate.HiberUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {

	public static Session getSession()
	{
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		return factory.openSession();
	}
}
