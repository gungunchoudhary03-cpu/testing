package CoreJAVApac;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class TC_LAB4_1 {
	
	public static void main(String args[]) {
	
		try {
			FileReader fr = new FileReader("C:\\Users\\Gungun.Choudhary\\git\\testing\\testing\\JAN2026\\src\\test\\java\\pac1\\text.txt");
		    StringBuilder sb = new StringBuilder();
			
				int ch;
				
				while ((ch = fr.read()) != -1) {
					sb.append((char) ch);
				}
				sb.reverse();
				
				FileWriter fw = new FileWriter("C:\\Users\\Gungun.Choudhary\\git\\testing\\testing\\JAN2026\\src\\test\\java\\pac1\\text.txt");
				fw.write(sb.toString());
				fw.close();
				System.out.println("File content reversed successfully.");
		}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
 