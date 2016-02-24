package behavpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	
	
	@Override
	public void update(Observable o, Object arg) {
		String msg=null;
		if(o instanceof MealOrder){
			 msg=(String)arg;
		}
		if(msg.equals("Accepted"))
		{
			System.out.println("Hooray Order Accepted");
		}
		else if(msg.equals("Pending"))
		{
			System.out.println("Wait Order is pending..!!");
		}
		else 
		{
			System.out.println("Order is ready Enjoy..!");
		}

	}

}
