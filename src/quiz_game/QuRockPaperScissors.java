package quiz_game;

import java.util.Scanner;

class RockPaperScissors {
	
	Scanner sc = new Scanner(System.in);
	
	void game() {
		
		int user, com;
		
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
		user = sc.nextInt();
		com = (int)(Math.random()*3);
		
		/*
		switch(user) {
		case 1:
			if(com == 1) {
				System.out.println("비겼습니다.");
			}
			else if(com == 2) {
				System.out.println("졌습니다 ㅠㅠ");
			}
			else {
				System.out.println("이겼습니다 !!");
			}
			break;
		case 2:
			if(com == 1) {
				System.out.println("이겼습니다 !!");
			}
			else if(com == 2) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("졌습니다 ㅠㅠ");
			}
			break;
		case 3:
			if(com == 1) {
				System.out.println("졌습니다 ㅠㅠ");
			}
			else if(com == 2) {
				System.out.println("이겼습니다 !!");
			}
			else {
				System.out.println("비겼습니다.");
			}
			break;
		default:
			System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
			game();
		}
		*/
		
		if (!(user==1||user ==2 || user==3)) {
			System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
			game();
		}
		else {
			switch(user-com) {
			case 0 :
				System.out.println("비겼습니다.");
				break;
			case 1: case -2:
				System.out.println("이겼습니다 !!");
				break;
			case -1: case 2:
				System.out.println("졌습니다 ㅠㅠ");
				break;
			}
		}
	}
	
	void roop() {
		for (int i = 1; i <= 5; i++) {
			game();
		}
		check();
	}
	
	void check() {
		
		int answer;
		
		System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
		answer = sc.nextInt();
		if(answer == 1) {
			roop();
		}
		else if (answer == 0) {
			System.out.println("게임이 종료되었습니다. 감사합니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요…");
			check();
		}
	}
	
}

public class QuRockPaperScissors {

	public static void main(String[] args) {
		
		RockPaperScissors rps = new RockPaperScissors();

		rps.roop();
		
	}

}
