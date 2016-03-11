package tasks;

import java.util.Map;
import java.util.TreeMap;

/**
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 * 
 * @author y
 *
 *
 */
public class T_13_Permutation {

	public static Map<Character, Integer> getCharCount(String s) {
		Map<Character, Integer> map = new TreeMap<>();

		char[] array = s.toCharArray();

		for (Character c : array) {
			int val;
			if (map.containsKey(c))
				val = map.get(c) + 1;
			else
				val = 1;
			map.put(c, val);
		}

		return map;
	}
	
	public static boolean isMapEqual(Map<Character, Integer> m1, Map<Character, Integer> m2)
	{
		return m1.equals(m2);
	}

	public static boolean run(String s1, String s2) {
		
		if ((s1 == null || s1.isEmpty()) || (s2 == null || s2.isEmpty()))
			return false;
		
		
		Map<Character, Integer> m1 = getCharCount(s1);
		Map<Character, Integer> m2 = getCharCount(s2);
		
		return m1.equals(m2);
	}
}
