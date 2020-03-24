package practice;

public class Qu_04_07 {

	public static void main(String[] args) {

		int num = 0;
		int total = 0;

		while (num <= 100) {
			
			num++;
			
			if (num % 3 == 0 || num % 7 == 0) {
				
				if (num % 3 == 0 && num % 7 == 0) {
					
					continue;

				}
							
				System.out.println(num);
				total += num;
			}
			
		}
		
		System.out.print("total = " + total);

	}

}
