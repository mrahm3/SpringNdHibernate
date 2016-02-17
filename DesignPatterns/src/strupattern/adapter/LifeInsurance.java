package strupattern.adapter;
/**
 * 
 * @author mrahm3
 *Adaptee
 */
public class LifeInsurance {
private double policyAmount;

public LifeInsurance(double policyAmount){
	super();
	this.policyAmount=policyAmount;
}

public double calculatePremium(){
	return policyAmount*.20;
}
}
