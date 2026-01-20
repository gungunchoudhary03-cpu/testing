package CoreJAVApac;

import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

public class TC_FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Text");
		
		String text = sc.nextLine();
		FileWriter fw = new FileWriter("C:\\Users\\Gungun.Choudhary\\git\\testing\\testing\\JAN2026\\src\\test\\java\\pac1\\text.txt");
		fw.write(text);
		fw.close();
		
	}

}
