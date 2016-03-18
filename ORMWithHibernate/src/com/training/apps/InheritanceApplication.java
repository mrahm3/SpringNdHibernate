package com.training.apps;

import java.util.Date;
import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.InPatient;
import com.training.utils.HiberUtils;

public class InheritanceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=HiberUtils.getFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		Timestamp date= new Timestamp(new Date().getTime());
		InPatient patient = new InPatient("Pritam",24,"A",date);
		session.save(patient);
		tx.commit();
		System.out.println("One patient added");
	}

}
