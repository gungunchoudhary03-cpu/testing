package CoreJAVApac;

class Base{
	
	public void baseMethod() {
		System.out.println("Base Method");
	}
	
}

class Derived extends Base{
	public void derivedMethod() {
		System.out.println("Derived Method");
	}	
}

public class TC_Inheritance{
	public static void main(String [] args) {
		Derived derived = new Derived();
		System.out.println(derived instanceof Derived);
		
		derived.baseMethod();
		derived.derivedMethod();
	
}

}