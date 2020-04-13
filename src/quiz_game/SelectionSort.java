package quiz_game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SelectionSort {
	static int[] arr = new int[10];
	
	public static int[] init(int[] arr) {
		
		ArrayList<Integer> basket = new ArrayList<Integer>();
		
		for(int i=1; i<=100;i++) {
			basket.add(i);
		}
		
		for(int j=100; j>90; j--) {
			int r = new Random().nextInt(j-1);
			arr[100-j] = (int)basket.get(r);
			basket.remove(r);
		}

		
		return arr;
	}
	
	
	public static int[] selectionSort(int choice, int[] arr) {
		
		if(choice ==1) {
			
			for (int i=0 ; i<arr.length-1;i++) {
				
				int temp = arr[i];
				int ind = 0;
				boolean ch = false;
				for (int j=i ; j<arr.length;j++) {
					if(temp>arr[j]) {
						temp = arr[j];
						ind = j;
						ch = true;
					}
				}
				if(ch==true) {
					arr[ind] = arr[i];
					arr[i] = temp;
					
				}
				
				System.out.printf("%d번째 정렬 :", i+1);
				showArr(arr);
				
			}
			return arr;
		}
		else {
			for (int i=0 ; i<arr.length-1;i++) {

				int temp = arr[i];
				int ind = 0;
				boolean ch = false;
				for (int j=i ; j<arr.length;j++) {
					if(temp<arr[j]) {
						temp = arr[j];
						ind = j;
						ch = true;
					}
				}
				if(ch == true) {
					arr[ind] = arr[i];
					arr[i] = temp;
				}
				
				System.out.printf("%d번째 정렬 :", i+1);
				showArr(arr);
			}
			return arr;
		}
	}
	
	public static void showArr(int[] arr) {
		
		for(int i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void sort() {
		arr = init(arr);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열보기:");
		showArr(arr);
		
		System.out.print("오름차순1, 내림차순2 :");
		int choice = scan.nextInt();
		arr = selectionSort(choice, arr);
		
	}
	
	public static void main(String[] args) {
		
		sort();
		
	}
}
