package strupattern.composite;

public class Client {

	public static void main(String[] args) {
		Store s1= new Store(5000, "A");
		Store s2= new Store(15000, "B");
		Store s3= new Store(30000, "C");
		City delhi= new City("Delhi");
		
	Store s4= new Store(5000, "A");
		Store s5= new Store(15000, "B");
		Store s6= new Store(40000, "C");
		City noida= new City("Noida");
		
		
		
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		System.out.println("Collection Delhi: "+delhi.getProfit());
		
		noida.addLeaf(s4);
		noida.addLeaf(s5);
		noida.addLeaf(s6);
		System.out.println("Collection Noida: "+noida.getProfit());
		
		State ncr=new State("ncr");
		ncr.addLeaf(noida);
		ncr.addLeaf(delhi);
		
		System.out.println("Collection State: "+ncr.getProfit());
		

	}

}
