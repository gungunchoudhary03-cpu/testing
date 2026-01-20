package CoreJAVApac;

import java.util.Scanner;

public class LAB5 {
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter num");
		int num = n.nextInt();
		
		if(num < 0) {
			System.out.println("num is negative");
		}
		else  {
			System.out.println("num is positive");
		}
		
	}
	
}
