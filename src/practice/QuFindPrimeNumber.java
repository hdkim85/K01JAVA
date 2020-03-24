package practice;

public class QuFindPrimeNumber {

	static boolean isFindPrimeNumber(int num) {

		if (num == 1) {
			return false;
		}

		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (isFindPrimeNumber(i) == true) {
				System.out.println(i);
			}
		}
	}

}
