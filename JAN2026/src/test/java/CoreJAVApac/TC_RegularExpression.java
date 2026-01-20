package CoreJAVApac;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TC_RegularExpression {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String input = "12345";
		String regEx = "\\d+";
		
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher("Hello");
		Boolean result = m.matches();
		
		if(result == true) {
			System.out.println("Valid NUmber");
		}
		else{
			System.out.println("Invalid NUmber");
		}
		
		String input1 = "Shop,Mop,Hopping,Chopping";
		Pattern pattern = Pattern.compile("hop");
		Matcher match = pattern.matcher(input1);
		System.out.println(match.matches());
		
		
		while(match.find()) {
			System.out.println(match.group()+":"+match.start()+":"+ match.end());
		}
		
		String phonemnumer ="8612345479";
		String regex1="\\d{10}";
 
		Pattern p1=Pattern.compile(regex1);
		Matcher m1=p1.matcher(phonemnumer);
		boolean result1=m1.matches();
		if(result1==true)
		{
			System.out.println("Valid phone number");
		}
		
		else
		{
			System.out.println("Invalid phone Number");
		}
		
		String input2 ="gungunchoudhary03@gmail.com";
		String regex2="[A-Z][a-z]+[0-9]$";
 
		Pattern p2=Pattern.compile(regex2);
		Matcher m2=p2.matcher(input2);
		boolean result2=m1.matches();
		if(result2==true)
		{
			System.out.println("MATCHING");
		}
		
		else
		{
			System.out.println("NOT MATCHING");
		}
		
		String email ="test.user@gmail.com";
		String emailregex2="^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
		 
		Pattern emailp2=Pattern.compile(emailregex2);
		Matcher emailm2=emailp2.matcher(email);
		boolean emailresult2=emailm2.matches();
		if(emailresult2==true)
		{
		System.out.println("email matching");
		}
		 
		else
		{
		System.out.println("email not matching");
		}
		 
		 
		 
		
	}
		
}


