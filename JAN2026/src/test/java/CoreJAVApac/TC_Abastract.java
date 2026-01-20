package CoreJAVApac;

abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class TC_Abastract {
	public static void main(String[] args) {
		rectangle obj = new rectangle();
		obj.draw();
	}

}
