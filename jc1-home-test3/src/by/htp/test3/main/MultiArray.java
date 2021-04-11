package by.htp.test3.main;

public class MultiArray {

	public static int numberOfValues01(int[][] mas) {

		int countMinus = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					countMinus++;
				}
			}
		}
		return countMinus;

	}

	public static int numberOfValues02(int[][] mas) {

		int countNumber = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == -5) {
					countNumber++;
				}
			}

		}
		return countNumber;

	}

}
