package practice;

class ChildProperty {
	
	int bead = 0;
	
	/*
	 디폴트 생성자는 개발자가 생성자를 정의하지 않았을때만
	 자동으로 생성된다.
	 */
	
	public ChildProperty(int _bead) {
		bead = _bead;
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수 " + bead);
	}
	
	public void obtainBead(ChildProperty opp, int oppbead) {
		
		//매개변수로 전달된어린이 객체는 게이에서 패배하ㅕ ㄹ\\\\ㅏ
		
		bead += oppbead;
		opp.bead -= oppbead;
		
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}

}
