package by.htp.test2.main;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCountMinusTest {

	@Test
	public void calcCountMinus() {
		int[] mas = new int[] { 33, 21, 15, -46, 12, -21, 18, -11, 13 };
		int realCountMinus;
		int expectedCountMinus = 3;
		realCountMinus = ArrayLogic.countMinus(mas);
		Assert.assertEquals(expectedCountMinus, realCountMinus);
	}

}
