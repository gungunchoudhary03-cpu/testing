package CoreJAVApac;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class TC_DateTime {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Instant currentTime = Instant.now();
		System.out.println("The current time is: " +currentTime);
		
		LocalDate now = LocalDate.now();
		
		LocalDate Independence = LocalDate.of(1947, Month.AUGUST, 15);
		Period period = Independence.until(now);
		
		System.out.println("Now: " + now);
		System.out.println("Independence:" + Independence);
		System.out.println("LastMonth: "+ now.minusMonths(1));
		System.out.println("Tomorrow: "+now.plusDays(1));
		System.out.println("Leap Year ? :" + now.isLeapYear());
		System.out.println("move to 30th day of the month: "+ now.withDayOfMonth(30));
		
		System.out.println("Period: "+ period);
		System.out.println("Days: "+ period.get(ChronoUnit.DAYS));
		System.out.println("Days: "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Days: "+ period.get(ChronoUnit.YEARS));
		
		ZonedDateTime ct = ZonedDateTime.now();
		ZonedDateTime ctinParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("India Time: "+ ct);
		System.out.println("Paris Time: "+ ctinParis);
		
		
	}
}
