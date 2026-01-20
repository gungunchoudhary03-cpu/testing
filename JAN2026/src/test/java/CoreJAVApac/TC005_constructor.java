package CoreJAVApac;

class Balance{
	String name;
	double bal;
	
	public Balance(String n, double b) {
		name = n;
		bal = b;
	}
	public void show() {
		
		if(bal>0) {
			System.out.println(name + ":" + "$" + bal);
		}

	}
}

public class TC005_constructor {
	public static void main(String []args) {
		Balance obj = new Balance ("Gungun", 100000.00);
		obj.show();
	}

}
