package strupattern.composite;

import java.util.*;

public class City implements Profitable {
	
private String cityName;
private List<Profitable> stores;


public City(String cityName) {
	super();
	this.cityName = cityName;
	stores= new ArrayList<Profitable>();
}
	@Override
	public double getProfit() {
		double profit=0;
		for(Profitable obj:stores)
		{
			profit=profit+obj.getProfit();
		}
		return profit;
	}

	

	@Override
	public void addLeaf(Profitable child) {
	if(child instanceof Store)
	{
		stores.add(child);
	}
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

}
