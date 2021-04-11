package by.htp.test4.start;

import by.htp.test4.entity.Fraction;
import by.htp.test4.logic.FractionLogic;
import by.htp.test4.presentation.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 7);

		Fraction f3;

		FractionLogic logic = new FractionLogic();

		f3 = logic.sum(f1, f2);

		FractionView view = new FractionView();

		logic.reduction(f3);

		view.printSum(f1, f2, f3);

		f3 = logic.division(f1, f2);

		logic.reduction(f3);

		view.printDivision(f1, f2, f3);

		f3 = logic.substract(f1, f2);

		logic.reduction(f3);

		view.printSubstract(f1, f2, f3);

		f3 = logic.multiplication(f1, f2);

		logic.reduction(f3);

		view.printMultiplication(f1, f2, f3);
	}

}