package regexPattern;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RejaxDate {

	
	private static final String DATE_PATTERN = "^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

    public static boolean isValidDate(String date) {
        // Compile the regex into a Pattern object
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        
        // Match the input date against the pattern
        Matcher matcher = pattern.matcher(date);
        
        // Return true if the date matches the pattern, otherwise false
        return matcher.matches();
    }
	public static void main(String[] args) {
        String[] testDates = { "2024-10-28", "2023-02-30", "2024-07-13", "2024-13-10", "invalid-date","2024-13-12" };

		// TODO Auto-generated method stub
		for (String date : testDates) {
            if (isValidDate(date)) {
                System.out.println(date + " is a valid date.");
            } else {
                System.out.println(date + " is NOT a valid date.");
            }
        }
		
	}

}
