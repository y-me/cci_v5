package tasks;

import static org.junit.Assert.*;

import java.util.Map;


import org.junit.Test;

public class T_13_PermutationTest {

	@Test
	public final void testRun() {
		
		assertTrue(T_13_Permutation.run("ABC", "ABC"));
		assertTrue(T_13_Permutation.run("ABC", "BAC"));
	}
	
	@Test
	public final void testRunFalse() {
		
		assertFalse(T_13_Permutation.run("ABC", ""));
		assertFalse(T_13_Permutation.run("ABC", null));
		assertFalse(T_13_Permutation.run("AB", "ABB"));
	}
	
	@Test
	public final void testGetCharCount(){
		Map<Character, Integer> map = T_13_Permutation.getCharCount("AAA");
		assertEquals(1, map.size());

		map = T_13_Permutation.getCharCount("ABC");
		assertEquals(3, map.size());

	}


}
