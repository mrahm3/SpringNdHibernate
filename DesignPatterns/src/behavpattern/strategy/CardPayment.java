package behavpattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		String msg="your payment request of INR."+amt+"By " +description+ " Received ";
		StringBuffer buffer= new StringBuffer(msg);
		
		double procFee= amt*0.012;
		double total=procFee+amt;
		buffer.append("\nprocessing fee of Rs."+procFee+ " is Chargeable ");
		buffer.append("\tTotal amount is "+total);
		
		return buffer.toString();
	}

}
