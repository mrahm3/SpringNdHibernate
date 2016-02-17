package crea.pattern.singleton;

public class Client {

	public static void main(String[] args) {
		Counter coun1=Counter.getInstance();
				System.out.println(coun1.hashCode());
		Counter coun2=Counter.getInstance();
		System.out.println(coun2.hashCode());
		
		Counter coun3=Counter.getInstance();
		System.out.println(coun3.hashCode());

	}

}
