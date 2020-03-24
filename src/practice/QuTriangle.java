package practice;

class Triangle {
	int bot =0, height = 0;
	double area=0;
	
	public void init(int a, int b) {
		bot = a;
		height = b;
	}
	
	
	public void setBot(int bot) {
		this.bot = bot;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public double getArea() {
		area = bot*height*0.5;
		return area;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBot(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}
