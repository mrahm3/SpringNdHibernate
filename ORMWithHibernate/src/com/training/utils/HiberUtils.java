package com.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtils {
	
	private static SessionFactory factory;
	
	static{
		
		try {
			factory = new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getFactory(){
		return factory;
	}
}
