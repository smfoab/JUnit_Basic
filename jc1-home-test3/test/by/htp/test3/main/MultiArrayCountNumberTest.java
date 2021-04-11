package by.htp.test3.main;

import org.junit.Assert;
import org.junit.Test;

public class MultiArrayCountNumberTest {

	@Test
	public void calcNumberOfValues02() {

		int[][] mas = { { 1, 2, 3 }, { 4, -5, 6 }, { -7, 8, -9 } };
		int realCountNumber = 1;
		int expectedCountNumber;

		expectedCountNumber = MultiArray.numberOfValues02(mas);

		Assert.assertEquals(expectedCountNumber, realCountNumber);
	}
}
