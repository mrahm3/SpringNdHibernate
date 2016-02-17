package crea.pattern.factory;

/**
 * 
 * @author mrahm3
 *
 *SubClass or Product 2
 */
public class PersonalLoan extends LoanAccount {
	
	private Double amount;
	private Integer year;


	protected PersonalLoan(Float rateOfInterest) {
		super(rateOfInterest);
		// TODO Auto-generated constructor stub
	}
   @Override
	public Double calculateInterest(Double LoanAmount) {
		
		return LoanAmount*getInterest();
	}

}
