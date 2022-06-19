import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateToMiliSeconds {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		long ts = dateFormat.parse("2022-05-19 00:00:00").getTime()/1000;
		System.out.println(ts);
	}

}
