package OOP_with_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

class DaysCalculation{
	public static Long calculateDaysBetweenTwoDatesMethod(Date startDate, Date endDate) {
		Long differenceInMS = endDate.getTime() - startDate.getTime();
		Long totalDays = differenceInMS / (1000*60*60*24);
		System.out.println("Number of Days is : "+totalDays);
		return ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
	}
}

public class CalculateDaysBetweenTwoDates {
	
	public static void main(String []args) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		String inputString1 = "2020-02-01";
		String inputString2 = "2020-02-21";
		try {
		    Date startDate = myFormat.parse(inputString1);
		    Date endDate = myFormat.parse(inputString2);
		    Long totalDays = DaysCalculation.calculateDaysBetweenTwoDatesMethod(startDate, endDate);
		    
			System.out.println("Number of Days is : "+totalDays);
		    
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}
}
