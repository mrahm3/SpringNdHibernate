package com.training.iface;

import java.util.List;

public interface MyDAO<T> {

	public Object add(T t);
	public T  find(Object obj);
	public List<T> findAll();
	public T update(T t);
	public boolean delete(Object obj);
	
}
