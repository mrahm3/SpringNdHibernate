package strupattern.proxy;

public class CalculatebeanProxy implements CalculateBean {

	
	private CalculateBeanImplementation real;

	@Override
	public void greet() {
		System.out.println("Welcome");
		
	}
}
