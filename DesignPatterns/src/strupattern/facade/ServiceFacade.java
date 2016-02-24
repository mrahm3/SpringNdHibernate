package strupattern.facade;

public class ServiceFacade {
 
  Hotels hotel = new Hotels();
  Flight flight= new Flight();
  public String getHotelAvailability()
  {
	  return hotel.getAvailaibilty();
  }
  
  public String getFlightAvailaibilty()
  {
	  return flight.getAvailaibilty();
  }
}
