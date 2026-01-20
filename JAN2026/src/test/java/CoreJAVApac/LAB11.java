package CoreJAVApac;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class LAB11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entery Date (yyyy/mm/dd) : ");
		String input = sc.next();
		
		LocalDate givenDate = LocalDate.parse(input);
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(givenDate, currentDate);
		System.out.println("Difference is: ");
		System.out.println(diff.getYears()+ "Years");
		System.out.println(diff.getMonths()+ "Months");
		System.out.println(diff.getDays()+ "Days");
	}

}
