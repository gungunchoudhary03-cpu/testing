package CoreJAVApac;

import java.io.FileInputStream;
import java.io.IOException;
 
public class TC_FileIO {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Gungun.Choudhary\\git\\testing\\testing\\JAN2026\\src\\test\\java\\pac1\\text.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		fis.close();
		
 
	}
 
}
 
 