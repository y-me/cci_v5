package tasks;

import static org.junit.Assert.*;

import java.util.function.Function;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class T_11_IsUniqueTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUpTest() throws Exception {
	}

	@After
	public void tearDownTest() throws Exception {
	}

	private boolean test(Function<String, Boolean> func, String value) {
		long start = System.nanoTime();

		boolean result = func.apply(value);

		long finish = System.nanoTime();
		System.out.println("Elapsed: " + (finish - start) / 1000 + "ms");

		return result;
	}

	@Test
	public final void testIsAllUnique() {
		String[] testVals = { "AAA", "11111111111111111111111111111111111111111111111111111",
				"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "!!!" };

		Function<String, Boolean> func = T_11_IsUnique::isAllUnique;
		System.out.println("Arrays");
		for (String s : testVals) {
			assertEquals(true, test(func, s));
		}

		System.out.println("StreamAPI");
		func = T_11_IsUnique::isAllUniqueStreamAPI;
		for (String s : testVals) {
			assertEquals(true, test(func, s));
		}

		System.out.println("Iterator");
		func = T_11_IsUnique::isAllUniqueIterator;
		for (String s : testVals) {
			assertEquals(true, test(func, s));
		}
	}

	@Test
	public final void testIsAllUniqueFail() {
		assertEquals(false, T_11_IsUnique.isAllUnique("123"));
		assertEquals(false, T_11_IsUnique.isAllUnique("mmmmmmmmmmmmmmmn"));
	}

	@Test
	public final void testIsAllUniqueEmptyString() {
		assertEquals(true, T_11_IsUnique.isAllUnique(""));
	}

}
