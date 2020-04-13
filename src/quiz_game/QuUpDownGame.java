package quiz_game;




import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void upDown() {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int com = random.nextInt(100);
			System.out.println(com);
			int cnt = 0;
			while(true) {
				System.out.println("1~100사이의 숫자를 입력하세요.");
				int player = scan.nextInt();
				scan.nextLine();
				if(player>=1 && player<=100) {
					cnt++;
					if(com==player) {
						System.out.printf("맞았습니다. com : %d, player : %d\n", com, player);
						break;

					}
					else if (com>player){
						System.out.printf("입력한 숫자가 낮습니다. 입력한 숫자 : %d\n", player);

					}
					else if(com<player) {
						System.out.printf("입력한 숫자가 높습니다. 입력한 숫자 : %d\n", player);
					}
					
				}
				else {
					System.out.println("숫자가 1~100의 범위를 벗어납니다.");
				}
				if(cnt==7) {
					System.out.println("숫자 맞추기 실패");
					break;
				}
			}

			//restart

			int restart;

			while(true) {
				System.out.print("게임재시작(1), 종료(0):");
				restart = scan.nextInt();
				if(restart==0 || restart==1) {
					//정상입력이면 루프탈출
					break;
				}
				else {
					System.out.println("잘못입력해씸ㅜㅜ\n");
				}
			}								
			if(restart==0) {
				//게임종료를 위해 while루프 탈출
				break;
			}
			else {
				System.out.println("게임 재시작^^");
			}
		}
	}

	public static void main(String[] args) {
		upDown();
	}
}


