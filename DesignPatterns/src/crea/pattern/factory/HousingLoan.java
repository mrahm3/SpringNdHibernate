package crea.pattern.factory;

/**
 * 
 * @author mrahm3
 *
 *SubClass or product 1
 */
public class HousingLoan extends LoanAccount {
	
	private Double amount;
	private Integer year;

	protected HousingLoan(Float rateOfInterest) {
		super(rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculateInterest(Double LoanAmount) {
		
	  
		return LoanAmount*getInterest();
	}

}
