package CoreJAVApac;

class parent{
	int x =10;
}

class child extends parent {
	int x = 20;
	void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
}

public class TC_SuperKeyword {
	public static void main(String[] args) {
		child c = new child();
		c.display();
	}
}
