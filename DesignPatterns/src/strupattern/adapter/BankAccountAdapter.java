package strupattern.adapter;

public class BankAccountAdapter extends BankAccount {
	
	private LifeInsurance insurance;

	public BankAccountAdapter(double principle, LifeInsurance insurance) {
		super(principle);
		this.insurance = insurance;
	}
	
	
	public double findTotalDue(){
		double insDue= insurance.calculatePremium();
		double bankDue=calculate();
		return insDue+bankDue;
	}

}
