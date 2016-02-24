package behavpattern.strategy;

public class Client {

	public static void main(String[] args) {
		
		Billpayment bp= new Billpayment();
		bp.setPmt(new CardPayment());
		System.out.println(bp.makePayment(300, "Card Payment"));
		

	}

}
