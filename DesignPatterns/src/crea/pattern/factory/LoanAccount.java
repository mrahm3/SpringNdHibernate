package crea.pattern.factory;

/**
 * 
 * @author mrahm3
 *SuperClass
 */
public abstract class LoanAccount {
	
	private Float rateOfInterest;
 public abstract Double calculateInterest(Double LoanAmt);
 
 protected LoanAccount(Float rateOfInterest){
	 this.rateOfInterest=rateOfInterest;
 }
	public Float getInterest(){
		return rateOfInterest;
	}

	
 
}
