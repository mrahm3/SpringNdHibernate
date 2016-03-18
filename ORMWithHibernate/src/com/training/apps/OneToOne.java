package com.training.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Address;
import com.training.entity.ClinicalAssistant;
import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class OneToOne {

	public static void main(String[] args) {
		

		SessionFactory factory=HiberUtils.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
		Address resiAddr= new Address("Gurgaon, Haryana"," Delhi");
		Address hospAddr= new Address("Bareilly","UP");
		
		//One to One
		ClinicalAssistant assistant = new ClinicalAssistant(201,"Sreedeep");
		
	    Doctor doc = new Doctor(106,"Rahman",9891,resiAddr,hospAddr,assistant);
	
	 // One to many
	    Set<Patient> patList = new HashSet<Patient>();
	  
	 patList.add(new Patient("Rajan" ,23));
	 patList.add(new Patient("Mahajan" ,29));
	 
	   doc.setPatientList(patList);
	Integer key=(Integer)session.save(doc);
		 System.out.println(key);
		
       tx.commit();
       session.close();
       
	}

}
