package by.htp.test2.main;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMultOddTest {

	@Test
	public void calcMultOdd() {
		int[] mas = new int[] { 33, 21, 15, -46, 12, -21, 18, -11, 13 };
		int realMultOdd;
		int expectedMultOdd = -223146;
		realMultOdd = ArrayLogic.multOdd(mas);
		Assert.assertEquals(expectedMultOdd, realMultOdd);
	}

}
