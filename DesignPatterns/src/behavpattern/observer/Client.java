package behavpattern.observer;

public class Client {

	public static void main(String[] args) {
		MealOrder ord=new MealOrder();
		ord.addObserver(new Waiter());
		ord.setStatus("Accepted");
		ord.setStatus(" ");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
             e.printStackTrace();

		}
	}
	
}
