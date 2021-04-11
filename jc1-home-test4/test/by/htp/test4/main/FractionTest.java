package by.htp.test4.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.test4.entity.Fraction;
import by.htp.test4.logic.FractionLogic;

public class FractionTest {
	@Test
	public void testFraction01() {

		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 7);

		FractionLogic logic = new FractionLogic();

		Fraction result = logic.sum(f1, f2);
		logic.reduction(result);

		Fraction expected = new Fraction(8, 5);

		Assert.assertEquals(expected, result);

	}

	@Test
	public void testFraction02() {

		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 7);

		FractionLogic logic = new FractionLogic();

		Fraction result = logic.division(f1, f2);
		logic.reduction(result);

		Fraction expected = new Fraction(21, 25);

		Assert.assertEquals(expected, result);

	}

	@Test
	public void testFraction03() {

		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 7);

		FractionLogic logic = new FractionLogic();

		Fraction result = logic.substract(f1, f2);
		logic.reduction(result);

		Fraction expected = new Fraction(-2, 5);

		Assert.assertEquals(expected, result);

	}

	@Test
	public void testFraction04() {

		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 7);

		FractionLogic logic = new FractionLogic();

		Fraction result = logic.multiplication(f1, f2);
		logic.reduction(result);

		Fraction expected = new Fraction(3, 7);

		Assert.assertEquals(expected, result);

	}

}
