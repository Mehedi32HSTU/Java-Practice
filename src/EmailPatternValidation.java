import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailPatternValidation {
private static void emailRegexCheck() {
		
//		final String EMAIL_PATTERN = "[_a-zA-Z1-9-]+(\\.[A-Za-z0-9]*)*@[_A-Za-z0-9-]+\\.[A-Za-z0-9]+(\\.[A-Za-z]*)*(\\.[A-Za-z]{2,})$";
//		final String EMAIL_PATTERN = "[_a-zA-Z1-9-]+(\\.[_A-Za-z0-9-]*)*@[_A-Za-z0-9-]+\\.[_A-Za-z0-9-]+(\\.[A-Za-z0-9]*)*[\\.[A-Za-z]+]$";
		final String EMAIL_PATTERN = "^[_A-Za-z1-9]+[_A-Za-z0-9-]*(\\.[_A-Za-z0-9-]*)*@[A-Za-z][_A-Za-z0-9-]*(\\.[_A-Za-z0-9-]*)*([\\.[A-Za-z]+])$";
		
		List<String> validEmails = new ArrayList<>(
				Arrays.asList(
						"abc@mail.com", 
						"ab.c@mail.com", 
						"ferdous.islam@neural-semiconductor.com",
						"ferdous-islam@neural-semiconductor.com",
						"ami.jonayed.ahmed.riduan@g.bracu.ac.bd",
						"ab-c@mail.com", 
						"a_b.c@mail.com", 
						"a_b.c@mail..com", 
						"fer-do-us.isl-am@neural-semiconductor.com",
						"fer_do_us-is_lam@neural-semiconductor.com",
						"fer_do_us-is_lam@neural-semico_ndu_ctor.com",
						"fer_do_us-is_lam@neural-semico-nductor.com",
						"ami.jonayed.ahmed.riduan@g.bracu.ac.bd",
						"ami.jonayed.ahmed.riduan@gssss.bracu.ac.bd",
						"ami.jonayed.ahmed.riduan@.bracu.ac.bd"
						)
				);
		
		for(String email : validEmails) {
			if (Pattern.matches(EMAIL_PATTERN, email)) System.out.println("correct valid email: " + email);
			else System.out.println("wrong invalid email: " + email);
			
//			if(email.matches(regex)) System.out.println("correct valid email: " + email);
//			else System.out.println("wrong invalid email: " + email);
		}
		
		
		List<String> invalidEmails = new ArrayList<>(
				Arrays.asList(
						"abc", 
						"abc@mail", 
						"@mail", 
						"123", "123@34.45", "123@mail.com"
						)
				);
		
		for(String email : invalidEmails) {
			if (Pattern.matches(EMAIL_PATTERN, email)) System.out.println("correct valid email: " + email);
			else System.out.println("wrong invalid email: " + email);
			
//			if(email.matches(regex)) System.out.println("correct valid email: "+email);
//			else System.out.println("wrong invalid email: "+email);
			
		}
	}
	
	public static void main(String[] args) {
		
		emailRegexCheck();
	}

}
