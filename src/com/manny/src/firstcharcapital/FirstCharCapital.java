package firstcharcapital;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Application that converts first character of all words
 * in a user inputed sentence to Upper case
 * @author gyabe
 *
 */
public class FirstCharCapital {

	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Gets input from user
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		// Prints new sentence
		System.out.println(firstCharToTitleCase(userInput));
	}

	/**
	 * Converts first character of all words in a given parameter - string 
	 * to Upper case and returns the new String
	 * @param string String to be processed
	 * @return Processed String
	 */
	public static String firstCharToTitleCase(String string) {
		// Converts string to all lower case and split words in string capturing trailing white spaces
		// Uses look behind and look ahead regex expression to achieve above and save them to array stringList
		String[] stringList = string.toLowerCase().split("(?<=\\s+)(?!\\s)");
		System.out.println(Arrays.toString(stringList));
		// Converts first character of each word to upper case
		for (int i = 0; i < stringList.length; i++) {
			stringList[i] = stringList[i].substring(0,1).toUpperCase() + stringList[i].substring(1);
		}
		// Combines words in stringList to get old sentence and return it
		return String.join("", stringList);
	}
}
