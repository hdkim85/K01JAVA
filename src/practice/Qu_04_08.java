package practice;

public class Qu_04_08 {

	public static void main(String[] args) {

		int layer = 1;
		
		while (layer <= 5) {
			
			int star = 1;
			
			while (star <= (6 - layer)) {
				System.out.print("* ");
				star++;
			}
			
			System.out.println();

			layer++;
		}
	}

}
