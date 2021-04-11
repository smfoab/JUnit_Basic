package by.htp.test2.main;

public class ArrayLogic {

	public static int countMinus(int[] mas) {
		int countMinus = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countMinus++;
			}
		}
		return countMinus;
	}

	public static int sumPlus(int[] mas) {
		int sumPlus = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				sumPlus = sumPlus + mas[i];
			}
		}
		return sumPlus;
	}

	public static int multOdd(int[] mas) {
		int multOdd = 1;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				multOdd = multOdd * mas[i];
			}
		}
		return multOdd;
	}

}