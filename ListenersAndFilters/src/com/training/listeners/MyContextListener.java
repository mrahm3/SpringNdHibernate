package com.training.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener,ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("========Context-destroyed=====");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         System.out.println("*****Context-initializeded*****");
         String url=event.getServletContext().getInitParameter("url");
         String className=event.getServletContext().getInitParameter("className");
         String userName=event.getServletContext().getInitParameter("userName");
         String passWord=event.getServletContext().getInitParameter("passWord");
         
           System.out.println("Context Initialized"+url +className+userName+": "+passWord);
           
           Connection con=null;
       	try
       	{
       		
       				Class.forName("className");
       				con=DriverManager.getConnection(url,userName,passWord);
       	}
       	catch(Exception e){
       		e.printStackTrace();
       	}
           
           event.getServletContext().setAttribute("Connection", con);
    }

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("Atttribute Added"+event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		System.out.println("Atttribute Removed"+event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		System.out.println("Atttribute Replaced"+event.getServletContext().getAttributeNames());
		
	}
	
}
