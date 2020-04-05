package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SelectionSort2 {
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
			
			
			int cnt = 0;
			for (int i=0 ; i<arr.length;i++) {
				
				for (int j=cnt ; j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				cnt++;
				showArr(arr);
			}
			return arr;
		}
		else {
			
			
			
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
		showArr(arr);
		
	}
	
	
	public static void main(String[] args) {

		
		sort();
		
		
	}
	

	
}
