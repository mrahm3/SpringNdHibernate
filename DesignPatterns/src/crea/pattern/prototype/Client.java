package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {
		
		Employee original= new Employee(101, "Name1");
		System.out.println("original"+original);
		
		Employee protoType=null;
		
		try {
			 protoType =(Employee)original.clone();
			protoType.setEmployeeName("Mr:Perfect1");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Original"+original);
		System.out.println("Prototype"+protoType);
	}

}
