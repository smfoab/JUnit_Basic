package by.htp.test2.main;

public class Array {
	public static void main(String[] args) {
		int[] mas = new int[] { 33, 21, 15, -46, 12, -21, 18, -11, 13 };

		System.out.println("Количество отрицательных элементов: " + ArrayLogic.countMinus(mas));
		System.out.println("Сумма положительных эллементов: " + ArrayLogic.sumPlus(mas));
		System.out.println("Произведение элементов на нечетной позиции: " + ArrayLogic.multOdd(mas));

	}

}
