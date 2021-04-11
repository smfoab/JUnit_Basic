package by.htp.test1.main;

import org.junit.Test;

import by.htp.test1.main.EqTriangle;
import junit.framework.Assert;

public class EqTriangleAreaTest {

	@Test
	public void calcArea01() {

		EqTriangle tr3 = new EqTriangle(2);
		double realArea;
		double expectedArea = 1.7320508075688772;

		realArea = tr3.calcArea();
		Assert.assertEquals(expectedArea, realArea);

	}

}
