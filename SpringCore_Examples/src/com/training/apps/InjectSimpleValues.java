package com.training.apps;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;
import com.training.domains.Invoice;
import com.training.domains.Item;

public class InjectSimpleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ConfigurableApplicationContext container=new ClassPathXmlApplicationContext("Coll_Injection.xml");
  
  Invoice inv= container.getBean(Invoice.class);
  System.out.println(inv);
  
  List<Item> itemList=inv.getItemList();
  HashMap<Integer,Item> hmap= new HashMap<Integer,Item>(); 
  
  for(Item obj:itemList)
  {
	  System.out.println(obj);
  }
  System.out.println(inv.getInvoiceNumber());
  
 /*Customer cust1=(Customer)container.getBean("custBean1");
  Customer cust2=container.getBean("custBean1",Customer.class);
  Customer cust3=container.getBean(Customer.class);
  
  System.out.println("Customer"+cust1);
  System.out.println("Hash code Customer1 "+cust1.hashCode());
  System.out.println("Customer"+cust2);
  System.out.println("Hash code Customer2 "+cust2.hashCode());
  System.out.println("Customer"+cust3);
  System.out.println("Hash code Customer3 "+cust3.hashCode());
  */container.close();
 
	}

}
