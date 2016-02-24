package strupattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Hotels implements Services {

	private HashMap<Integer, String> list= new HashMap<Integer,String>();
	
	
	public Hotels() {
		super();
		
		list.put(1, "Rooms available");
	}


	@Override
	public String getAvailaibilty() {
		StringBuffer buf=new StringBuffer("Hotel availability");
		for(Map.Entry<Integer, String> entry:list.entrySet())
		{
			buf.append("Hotel no"+entry.getKey()+ " "+ entry.getValue()+ "\n");
		}
		return null;
	}

}
