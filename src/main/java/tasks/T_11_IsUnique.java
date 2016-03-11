package tasks;

import java.text.StringCharacterIterator;

/**
 * 
 * @author y
 * @category Task implementations
 * 
 *           Implement an algorithm to determine if a string has all unique
 *           characters. What if you cannot use additional data structures?
 */
public class T_11_IsUnique {

	public static boolean isAllUnique(String s) {

		if (s == null || s.isEmpty())
			return true;
		char prev = Character.MIN_VALUE;
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (prev == Character.MIN_VALUE)
				prev = c;
			else if (prev != c)
				return false;
		}

		return true;
	}

	public static boolean isAllUniqueStreamAPI(String s) {

		if (s == null || s.isEmpty())
			return true;

		long cnt = s.chars().distinct().count();

		return (cnt == 1) ? true : false;
	}

	public static boolean isAllUniqueIterator(String s) {
		if (s == null || s.isEmpty())
			return true;

		StringCharacterIterator si = new StringCharacterIterator(s);

		char c = si.first();

		while (c != StringCharacterIterator.DONE) {
			char c1 = si.next();

			if ((c != c1) && (c1 != StringCharacterIterator.DONE))
				return false;
			c = c1;
		}

		return true;
	}

}
