package quiz_game;

import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame {
	
	
	static void showArr(int[] arr) {
		System.out.println("생성번호");
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	static boolean end() {
		Scanner scan = new Scanner(System.in);
		System.out.println("게임이 종료되었습니다. 재시작(1), 종료(0)");
		int restart=scan.nextInt();
		while(true) {
			if(restart==1 || restart==0) {
				System.out.println("게임을 다시 시작합니다.");
				break;
			}
			else{
				System.out.println("1이나 0을 입력하세요.");
			}
		}
		
		if(restart ==1) {
			System.out.println("게임을 다시 시작합니다.");
			return true;
		}
		else {
			System.out.println("게임을 종료합니다.");
			return false;
		}
	}
	
	
	public static void baseball(){
		
		int[] ranArr = {1,2,3,4,5,6,7,8,9};
		int[] com = new int[3];
		Random random = new Random();
		int cnt = 0;
		
		//com 중복되지않는 정수 생성
		for(int i=0 ; i<3; i++) {
			int num = random.nextInt(9-i);
//			System.out.println(num);
			com[i] = ranArr[num];
			
			for(int j = num; j<ranArr.length-1; j++) {
				ranArr[j] = ranArr[j+1];
			}
		}
		
		showArr(com);
		
		
		while(true) {
			
			//플레이어 입력
			Scanner scan = new Scanner(System.in);
			int[] player = new int[3];
			
			for(int i=0; i<3; i++) {
				System.out.println("숫자를 입력하세요.");
				player[i] = scan.nextInt();
			}
			
			showArr(player);
			
			//strike, ball 판정
			
			int strike = 0;
			int ball = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i]==player[j]) {
						if(i==j) {
							System.out.printf("%d스트라이크 ",strike);
							strike++;
						}
						else {
							System.out.printf("%d볼",ball);
							ball++;
						}
					}
				}
			}
			
			if(strike==0 && ball==0) {
				System.out.println("아웃!");
			}
			
			cnt++;
			System.out.println();
			System.out.println("시도횟수 :" + cnt);
			
			if(strike==3) {
				
				if(end()==false) {
					break;
				}
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		baseball();
		
		
		
	}

}
