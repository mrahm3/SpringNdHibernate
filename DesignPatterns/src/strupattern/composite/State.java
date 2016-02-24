package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {
  
	
	private String stateName;
	private List<Profitable> cityList;
	
	
	public State(String stateName ) {
		super();
		this.stateName = stateName;
		cityList = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		double profit=0;
		for(Profitable city:cityList)
		{
			profit=profit+city.getProfit();
		}
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
       if(child instanceof City)
       {
    	   cityList.add(child);
       }
	}

	@Override
	public void removeLeaf(Profitable child) {
		

	}

}
