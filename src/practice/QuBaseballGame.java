package practice;

import java.util.Scanner;

class BaseballGame {

	Scanner sc = new Scanner(System.in);

	int[] user = new int[3];
	int[] com = new int[3];
	int strike = 0, ball = 0, out = 0, trying = 1;

	public void makeUserNum() {

		int num;
		int i = 0;
		
		System.out.println(trying + "번째 시도 !!");

		while (i <= 2) {

			
			System.out.print((i + 1) + "번째 숫자를 입력하세요(1~9). : ");
			num = sc.nextInt();

			if (num < 1 || num > 9) {
				System.out.println("똑바로 입력해라 .. . . .");
				continue;
			}
			else {
				user[i] = num;
				i++;
			}
		}

		trying++;

	}

	void makeComNum() {
		
		int num = 0;
		boolean check = false;
		int i = 0;
		
		System.out.println("컴퓨터 번호 생성 중 ...");
		
		while(i<3) {
			num = (int) (Math.random() * 10);
			if(num == 0) {
				continue;
			}
			for(int j =0 ; j<=i; j++) {
				if(num==com[j]) {
					check=true;
				}
			}
			if(check==true) {
				check = false;
				continue;
			}
			else {
				com[i]=num;
			}
			i++;
		}

	}

	void compareNum() {

		for (int i = 0; i <= 2; i++) {

			if (user[i] == com[i]) {
				strike++;
			} else {
				for (int j = 0; j <= 2; j++) {
					if (user[i] == com[j]) {
						ball++;
					}
				}
			}
		}
		
		System.out.printf("%d Strike %d Ball !!!\n", strike, ball);

		if (strike == 3) {
			out++;
			System.out.println("쓰리 스트라이크!!!!");
			System.out.printf("컴퓨터의 번호 : %d, %d, %d, (%d번 시도)\n", com[0],com[1],com[2],trying);
		} else if (strike == 0 && ball == 0) {
			out++;
			System.out.println("아웃!!!!");
			System.out.printf("컴퓨터의 번호 : %d, %d, %d\n", com[0],com[1],com[2]);
		}
		strike =0; ball=0;

	}

	void gaming() {

		int end = 0;

		makeComNum();

		while (out < 1) {
			makeUserNum();
			compareNum();
		}

		while (end < 1) {
			System.out.println("다시 하시겠습니까? 1.다시하기 0.종료");
			end = sc.nextInt();

			if (end == 1) {
				strike = 0; ball = 0; out = 0; trying = 1;
				gaming();
			} 
			else if (end == 0) {
				break;			
			}
			else {
				System.out.println("똑바로 입력해 . . .");
				continue;
			}
		}

	}

}

public class QuBaseballGame {

	public static void main(String[] args) {

		BaseballGame bs = new BaseballGame();
		
		bs.gaming();

	}

}
