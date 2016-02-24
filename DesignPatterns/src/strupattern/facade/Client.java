package strupattern.facade;



public class Client {
	public static void main(String[] args) {
		ServiceFacade facade = new ServiceFacade();
		System.out.println(facade.getFlightAvailaibilty());
		System.out.println(facade.getHotelAvailability());
	}
 

}
