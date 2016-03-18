package com.training.apps;

import org.hibernate.*;

import com.training.entity.Address;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;
import com.training.DAO.*;

public class FirstApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=HiberUtils.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
		Address resiAddr= new Address("Gurgaon, Haryana"," Delhi");
		Address hospAddr= new Address("Bareilly","UP");
		
	//	Doctor doc = new Doctor(1012,"Rahman",9891,resiAddr,hospAddr);
	//	Integer key=(Integer)session.save(doc);
	//	System.out.println(key);
  /*      
	   DoctorDAO doctorDao=new DoctorDAO();
	  Object key=doctorDao.add(doc);
	    System.out.println(key);
	    
	    */
		/*Doctor doc2=(Doctor)session.get(Doctor.class,101);
		System.out.println(doc2);
		Doctor doc3=(Doctor)session.load(Doctor.class,101);
		System.out.println(doc3);*/
		tx.commit();
		factory.close();
	}

}
