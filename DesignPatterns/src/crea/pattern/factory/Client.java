package crea.pattern.factory;

public class Client {

	public static void main(String[] args) {
	
		
		LoanAccount pacnt1=LoanFactory.getInstance("personalLoan");
		LoanAccount pacnt2=LoanFactory.getInstance("");
		LoanAccount pacnt3=LoanFactory.getInstance("housingLoan");
		pacnt1.calculateInterest(200.00);
		
		LoanAccount account =LoanFactory.getInstance();
		System.out.println("personal Loan EMI"+ account.calculateInterest(200.00));
	//	System.out.println("Rate Interest"+account.getRateOfInterest());
	//	LoanAccount account2 =LoanFactory.getInstance(LoanType.HOUSINGLOAN);
	//	System.out.println("Housing  Loan EMI"+ account2.calculateInterest(500.00));
	//	System.out.println("Rate Interest"+account2.getRateOfInterest());
	}

}
