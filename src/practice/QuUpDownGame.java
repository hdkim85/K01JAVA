package practice;

import java.util.Scanner;

class Game {

	Scanner sc = new Scanner(System.in);

	void randGame() {

		int myNum;
		int randNum = (int) (Math.random() * 100) + 1;
		int i = 1;

		while (i <= 7) {

			System.out.println(i + "번째 시도 !");
			System.out.print("번호를 입력하세요 (1~100). : ");

			myNum = sc.nextInt();

			if (myNum < 1 || myNum > 100) {
				System.out.println("숫자 똑바로 입력하세요..");
				continue;
			}

			if (myNum == randNum) {
				System.out.println("성공 ~~!");
				break;
			} else {
				if (myNum < randNum) {
					System.out.println("업!");
				} else {
					System.out.println("다운~!");
				}
			}

			i++;

		}
		
		restart();

	}

	void restart() {

		int choice;

		System.out.println("다시 하시겠습니까? 1.재시작, 0.프로그램 종료");
		choice = sc.nextInt();

		if (!(choice == 0 || choice == 1)) {
			System.out.println("똑바로 입력해라 . . . .");
			restart();
		}

		else {
			if (choice == 1) {
				randGame();
			}
		}

	}

}

public class QuUpDownGame {

	public static void main(String[] args) {

		Game game = new Game();

		game.randGame();

	}

}
