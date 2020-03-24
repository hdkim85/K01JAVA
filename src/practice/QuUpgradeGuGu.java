package practice;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.print(i);
				int gop = i;

				if (j == 1) {
					System.out.printf(" X 1 = %d%n", i);
					continue;
				}

				for (int x = 2; x <= j; x++) {
					System.out.printf(" X %d", i);
					gop *= i;
				}

				System.out.println(" = " + gop);
			}

		}

	}

}
