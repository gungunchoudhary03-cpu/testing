package pac1;

public class TC001_variables {
	private static double width = 10;
	private static double height = 10;
	private static double depth = 10;
	
	
	public static double volume() {
		double temp ;
		temp = width*height*depth;
		
		return temp;
	}
	
	public static void main(String args[]) {
		System.out.println("Volume is : "+ volume());
	}

}
