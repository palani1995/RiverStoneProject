package com.riverstone.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MyHibernateUtil {
	
	private static final SessionFactory sf = buildSessionFactory();
	

	// this method acts like a utility, we can use this method to start sessionfactory,transactions,commit and rollback operations.
	private static SessionFactory buildSessionFactory()
	{
		try {
			Configuration con = new Configuration();
			con.configure();
			Properties prop = con.getProperties();
			StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
			StandardServiceRegistry sr = srb.applySettings(prop).build();
			SessionFactory fct = con.buildSessionFactory(sr);
			return fct;
			
		} catch (Exception ex) {
			System.err.println("SessionFactory creation failed" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sf;
	}

	//using 	
	
}