package strupattern.adapter;

public class Client {

	public static void main(String[] args) {
		BankAccountAdapter adapter= new BankAccountAdapter(50000, new LifeInsurance(60000));
		
		double totalDue=adapter.findTotalDue();
		System.out.println("Total due: "+totalDue);
	}

}
