package com.training.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Doctor;
import com.training.iface.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {
 
	SessionFactory factory=HiberUtils.getFactory();
	@Override
	public Object add(Doctor t) {

	
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		Integer key=(Integer)session.save(t);
		tx.commit();
		session.close();
		factory.close();
		
		
		return key;
	}

	@Override
	public Doctor find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		Session session=factory.openSession();
		List<Doctor> docList=session.createQuery("from Doctor").list();
		session.close();
		
		return docList;
	}

	@Override
	public Doctor update(Doctor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
   
}


