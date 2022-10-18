package stringprocessor;

/**
 * Processes strings and return information from string
 * @author gyabe
 *
 */
public class StringProcessor {

	/**
	 * Constant String
	 */
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	/**
	 * Processes strings and return string usernames and their corresponding email
	 * Each user's info is on a separate line
	 * @param input String
	 * @return String of processed input
	 */
	public static String convert1(String input) {
		String[] inputArray = input.split(System.lineSeparator());
		String result = "";
		for (int i = 1; i < inputArray.length; i++) {
			String[] currData = inputArray[i].split(";");
			result += currData[0] + " ==> "  + currData[2] + System.lineSeparator();
			
		}
		return result;
	
	}
	
	/**
	 * Processes strings and return string user's full names and their corresponding email
	 * Each user's info is on a separate line
	 * @param input String
	 * @return String of processed input
	 */
	public static String convert2(String input) {
		String[] inputArray = input.split(System.lineSeparator());
		String result = "";
		for (int i = 1; i < inputArray.length; i++) {
			String[] currData = inputArray[i].split(";");
			result += currData[1] + " (email: "  + currData[2] + ")" +System.lineSeparator();
			
		}
		return result;
	
	}

}

