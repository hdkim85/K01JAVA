package ex08class;

/*
 해당 예제에서는 Human클래스를 외부파일로 선언하였다.
 동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아서
 즉시 객체(인스턴스)화 할 수 있다.
 만약 다른 패키지에 선언된 클래스라면 반드시 import선언을
 해줘야 한다.
 */

public class E02HumanMain {

	public static void main(String[] args) {

		//1. 객체 생성
		Human hm = new Human();
		
		//2.객체의 초기화
		hm.name = "Micheal";
		hm.age = 28;
		hm.energy = 4;
		
		//3.멤버메소드를 통해 상태 등의 행동을 구현함
		hm.showState();
		hm.eat();
		hm.walk();
		hm.thinking();
		hm.showState(); // 에너지 3
		
		
		//4. 에너지 고갈시키기
		for(int i = 1; i<=20; i++) {
			hm.walk();
		}
		//5. 에너지 20 넘겨보기
		hm.showState();
		for(int i = 1; i<=20; i++) {
			hm.eat();
		}
		hm.showState();
	}

}
