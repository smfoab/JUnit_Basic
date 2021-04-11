package by.htp.test2.main;

import org.junit.Assert;
import org.junit.Test;

public class ArraySumPlusTest {

	@Test
	public void calcSumPlus() {
		int[] mas = new int[] { 33, 21, 15, -46, 12, -21, 18, -11, 13 };
		int realSumPlus;
		int expectedSumPlus = 112;
		realSumPlus = ArrayLogic.sumPlus(mas);
		Assert.assertEquals(expectedSumPlus,realSumPlus);
	}

}