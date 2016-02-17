package crea.pattern.factory;


/**
 * 
 * @author mrahm3
 *Factory class with a static method to create instance of subClass
 *
 */
public class LoanFactory {

	
	
	public static LoanAccount getInstance(String LoanType){
			
		switch(LoanType){
		  case "housingLoan" :
			  return new HousingLoan(13.0f);
			
		    case "personalLoan" :
			  return new PersonalLoan(14.0f);
			  
			default:
				return null;
		}
		
	}
	public static LoanAccount getInstance(){
		return new PersonalLoan(14.0f);
	}
}
