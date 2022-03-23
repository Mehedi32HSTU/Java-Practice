package OOP_with_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateOnly{
	public static String getDateWithoutTimeUsingFormat(Date parameterDate) {
		try {			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			return formatter.format(parameterDate);
		} catch (Exception e) {
			System.out.println("Cannot Parse the date. Exception occured :"+e);
			return null;
		}
	}
}
	
public class OnlyDateFromDateObject {

	public static void main(String[] args) {
		Date today = new Date();
		String formattedDate = DateOnly.getDateWithoutTimeUsingFormat(today);
		System.out.println("Formatted Date is : "+formattedDate);
		
		String newDate = "2022-02-02";
		Date tempDate;
		try {
			tempDate = new SimpleDateFormat("yyyy-MM-dd").parse(newDate);
			System.out.println("Temp Formatted Date is : "+tempDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
