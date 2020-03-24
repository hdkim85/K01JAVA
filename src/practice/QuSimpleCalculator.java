package practice;

class CalculatorEx {

	int countAdd, countMin, countMul, countDiv;

	public double add(double a, double b) {
		countAdd++;
		return a + b;
	}

	public double min(double a, double b) {
		countMin++;
		return a - b;
	}

	public double mul(double a, double b) {
		countMul++;
		return a * b;
	}

	public double div(double a, double b) {
		countDiv++;
		return a / b;
	}

	public void init() {
		countAdd = 0;
		countMin = 0;
		countMul = 0;
		countDiv = 0;
	}
	
	public void showOpCount() {
		System.out.println("덧셈횟수 : " + countAdd);
		System.out.println("뺄셈횟수 : " + countMin);
		System.out.println("곱셈횟수 : " + countMul);
		System.out.println("나눗셈횟수 : " + countDiv);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {

		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 = " + cal.div(100, 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
		cal.showOpCount();

	}

}
