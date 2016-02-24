package behavpattern.strategy;

public class Billpayment  {

	PaymentStrategy pmt;

	public Billpayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentStrategy getPmt() {
		return pmt;
	}

	public void setPmt(PaymentStrategy pmt) {
		this.pmt = pmt;
	}
	
	public String makePayment(double amt,String description)
	{
		return pmt.pay(amt, description);
	}
	
	
	

}
