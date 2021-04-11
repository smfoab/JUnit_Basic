package by.htp.test3.main;

import org.junit.Assert;
import org.junit.Test;

public class MultiArrayCountMinusTest {

	@Test
	public void calcNumberOfValues01() {

		int[][] mas = { { 1, 2, 3 }, { 4, -5, 6 }, { -7, 8, -9 } };
		int realCountMinus = 3;
		int expectedCountMinus;

		expectedCountMinus = MultiArray.numberOfValues01(mas);

		Assert.assertEquals(expectedCountMinus, realCountMinus);
	}
}