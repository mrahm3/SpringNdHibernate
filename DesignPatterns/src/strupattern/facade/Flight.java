package strupattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Flight implements Services {
   
	private HashMap<String, Integer> list= new HashMap<String, Integer>();

	public Flight() {
		super();
		list.put("Air India", 10);
		list.put("kingFisher", 10);
		list.put("Air Asia", 10);
	}

	@Override
	public String getAvailaibilty() {
		StringBuffer buf= new StringBuffer("Flight Availability");
		for(Map.Entry<String, Integer> entry:list.entrySet())
		{
			buf.append("Hotel no"+entry.getKey()+ " "+ entry.getValue()+ "\n");
		}
		return null;
	}
	
	
	
}
