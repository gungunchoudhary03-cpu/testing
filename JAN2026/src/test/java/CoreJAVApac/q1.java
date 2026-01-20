package CoreJAVApac;

import java.util.*;

class acc{
	public static String generateAccNo() {
		long time = System.currentTimeMillis();
		int random = new Random().nextInt(900)+100;
		return time+""+random;
		
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acc obj = new acc();
		System.out.println("Account no. : " +obj.);
	}

}
