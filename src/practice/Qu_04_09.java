package practice;

public class Qu_04_09 {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {

				System.out.printf("%2d*%d=%-2d", i, j, (i * j));

			}

			System.out.println();

		}

	}

}
