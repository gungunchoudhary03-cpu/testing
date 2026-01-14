package pac1;

class Box{
	double width = 10;
	double height = 10;
	double depth = 10;
	
	double calVol() {
		return width*height*depth;
	}
}

public class Tc003_Class {
	
	public static void main(String [] args) {
		Box obj = new Box();
		System.out.println(obj.calVol());
	}

}
