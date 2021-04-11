package by.htp.test1.main;

import org.junit.Test;

import by.htp.test1.main.EqTriangle;
import junit.framework.Assert;

public class EqTrianglePerimeterTest {

	@Test
	public void calcPerimeter01() {

		EqTriangle tr3 = new EqTriangle(5);
		double realPerimeter;
		double expectedPerimeter = 15;

		realPerimeter = tr3.calcPerimeter();
		Assert.assertEquals(expectedPerimeter, realPerimeter);

	}

}