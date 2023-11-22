package projday6;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d.getMinutes());
//		System.out.println(d.getYear());

//		LocalDate ld = LocalDate.now();
		LocalDate ld = LocalDate.parse("1998-09-30"); //month= MM, minutes=mm
		LocalDate ld1 = LocalDate.of(2023, 10, 16);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
//		System.out.println(dtf.format(ld1));
//		System.out.println(ld);
//		System.out.println(ld1);
//		System.out.println(ld.getDayOfMonth());
//		System.out.println(ld.getDayOfYear());
//		System.out.println(ld.getMonthValue());
//		System.out.println(ld.getYear());
		
//		LocalTime lt = LocalTime.now();
		LocalTime lt = LocalTime.of(12,30);
//		System.out.println(lt);
		
//		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt = LocalDateTime.parse("2023-10-10T23:40");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm a");
//		System.out.println(dtf1.format(ldt));
//		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt);
		
		
		
		Period p= ld.until(ld1);
		System.out.println(p.getYears());
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
	}

}
