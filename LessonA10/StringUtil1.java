/**
 * 
 * @author Aarav Navani
 * Period #3
 *
 *         A class that executes several different functions on Strings that are
 *         sent to it.
 *
 */
public class StringUtil1 {

	/**
	 * reverse method - receives a string and reverses its characters
	 * 
	 * @param str
	 *            - string to be reversed
	 * @return - reversed string
	 */
	public static String reverse(String str) {
		if (str.length() == 0) {
			return "";
		} else {
			return str.charAt(str.length() - 1)
					+ reverse(str.substring(0, str.length() - 1));
		}
	}

	/**
	 * isPalindrome method - returns true if the string input reads the same
	 * both directions
	 * 
	 * @param str
	 *            - string input to be checked
	 * @return - boolean: true if palindrome and false if not
	 */
	public static boolean palindrome(String str) {
		str = removePunctuation(str).trim();

		if (str.equals("") || str.length() == 1) {
			return true;
		} else if (str.length() == 2 && (str.charAt(0) == str.charAt(1))) {
			return true;
		} else if (str.toLowerCase().charAt(0) == str.toLowerCase().charAt(
				str.length() - 1)
				&& palindrome(str.toLowerCase().substring(1, str.length() - 1)) == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * helper method to help palindrome method that removes punctuation and
	 * spaces in input string
	 * 
	 * @param word
	 *            - string to be trimmed
	 * @return - stripped string
	 */
	private static String removePunctuation(String word) {

		if ((word.charAt(0) >= 32 && word.charAt(0) <= 47)
				|| (word.charAt(0) >= 58 && word.charAt(0) <= 64)
				|| (word.charAt(0) >= 91 && word.charAt(0) <= 96)
				|| (word.charAt(0) >= 123 && word.charAt(0) <= 126)) {
			if (word.length() == 1) {
				return "";
			} else {
				return removePunctuation(word.substring(1));
			}
		} else {
			if (word.length() == 1) {
				return "" + word.charAt(0);
			} else {
				return word.charAt(0) + removePunctuation(word.substring(1));
			}
		}
	}

	/**
	 * 
	 * @param str
	 *            - string to be converted to shorthand
	 * @return - the shorthand string
	 */

	public static String shorthand(String str) {

		if (str.toLowerCase().indexOf("and") >= 0) {
			str = myReplaseMethod(str, "and", "&");
			shorthand(str);
		}
		if (str.toLowerCase().indexOf("to") >= 0) {
			str = myReplaseMethod(str, "to", "2");
			shorthand(str);
		}
		if (str.toUpperCase().indexOf("FOR") >= 0) {
		      str = myReplaseMethod(str, "FOR", "4");
		      shorthand(str);

		}
		if (str.toUpperCase().indexOf("YOU") >= 0) {
			str = myReplaseMethod(str, "YOU", "u");
			shorthand(str);
		}
		if (str.toLowerCase().indexOf("you") >= 0) {
		   str = myReplaseMethod(str, "you", "u");
		   shorthand(str);
		}
	
		str = removeVowels(str);

		
		return str;
	}

	/**
	 * Helper method to help shorthand method to remove vowels
	 * 
	 * @param str
	 *            - string where vowels will be removed from
	 */
	private static String removeVowels(String s) {
		if (s.length() == 0) {
			return "";
		}
		if (s.length() == 1) {
			if (isVowel(s.charAt(0))) {
				return "";
			} else {
				return s;
			}
		}
		if (isVowel(s.charAt(0))) {
			return removeVowels(s.substring(1));
		} else {
			return (s.charAt(0) + removeVowels(s.substring(1)));
		}
	}

	/**
	 * Helper method to help removeVowels method check if character is vowel
	 * 
	 * @param c
	 *            - character to be checked
	 * @return - true if vowel and false if not
	 */
	private static boolean isVowel(char c) {
		if ((int) c == 65 || (int) c == 69 || (int) c == 73 || (int) c == 79
				|| (int) c == 85 || (int) c == 97 || (int) c == 101
				|| (int) c == 105 || (int) c == 111 || (int) c == 117) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Helper method to help shorthand method -- Replases string inside a string
	 * with another string
	 * 
	 * @param theString
	 *            - original string
	 * @param toBeReplased
	 *            - string in original string to be Replased
	 * @param Replasement
	 *            - Replasement of string to be Replased
	 * @return - changed string with Replasement
	 */
	private static String myReplaseMethod(String theString,
			String toBeReplased, String replasement) {

		int index = theString.toLowerCase().indexOf(toBeReplased.toLowerCase());
		theString = theString.substring(0, index)
				+ replasement
				+ theString.substring(index + toBeReplased.length(),
						theString.length());
		return theString;
	}

}// end class




