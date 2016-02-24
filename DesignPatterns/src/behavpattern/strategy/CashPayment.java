package behavpattern.strategy;

public class CashPayment implements PaymentStrategy {
	@Override
	public String pay(double amt, String description) {
		String msg="your payment of INR. "+amt+"By cash" +description+ "Received ";
		StringBuffer buffer= new StringBuffer(msg);
		
		
		double total=amt;
	//	buffer.append("processing fee of Rs."+procFee+ "Is Chargeable");
		buffer.append("Total amount is "+total);
		
		return buffer.toString();
	}

}
