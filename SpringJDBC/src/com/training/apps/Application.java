package com.training.apps;


import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.training.daos.InvoiceDaoImpl;
import com.training.daos.ServiceRequestDAO;
import com.training.entity.Customer;
//import com.training.entity.Invoice;
import com.training.entity.Item;
import com.training.entity.ServiceRequest;

public class Application {

	public static void main(String[] args) {
		
      /* ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
       InvoiceDaoImpl obj= ctx.getBean("dao",InvoiceDaoImpl.class);
       Invoice inv=ctx.getBean("invoice",Invoice.class);
       inv.setInvoiceNumber(101);
       inv.setCustomerName("Raju");
       inv.setAmount(4500.00);
       
       boolean result=obj.add(inv);
       System.out.println("Row added: "+result);
       
       inv= obj.find(101);
       System.out.println(inv);
       List<Invoice> invList;
       invList=obj.findAll();
       System.out.println(invList);
      ctx.close();*/
		ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("bean1.xml");
		ServiceRequestDAO obj=ctx.getBean("dao",ServiceRequestDAO.class);
		ServiceRequest sr=ctx.getBean("serviceRequest", ServiceRequest.class);
		Customer cus=ctx.getBean("customer",Customer.class);
		Item it=ctx.getBean("item", Item.class);
		sr.setComplainId(101);
		cus.setCustomerName("Raja");
		
		it.setItemName("Laptop");
		sr.setDescription("Hard-disk problem");
		cus.setMobileNumber(9891818);
		sr.setCust(cus);
		sr.setProduct(it);
		
		/*boolean result=obj.add(sr);
		System.out.println("Row added"+result);*/
		
		sr=obj.find(101);
		System.out.println(sr);
		
	}

}
