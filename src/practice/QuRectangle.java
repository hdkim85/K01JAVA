package practice;

/*
class Rectangle
{
	//멤버변수
   	private int ulx, uly;//좌상단(upper left x, upper left y)
   	private int lrx, lry;//우하단(lower right x, lower right y)
   	private Boolean error = false;

   	//생성자
   	public Rectangle(int ulx, int uly, int lrx, int lry) {
   		if (ulx < 0 || uly <0) {
   			System.out.println("좌상단 좌표 범위가 잘못되었습니다.");
   			error = true;
   		}
   		else {
   			this.ulx = ulx;
   			this.uly = uly;
   		}
   		if (lrx > 100 || lry > 100) {
   			System.out.println("우하단 좌표 범위가 잘못되었습니다.");
   			error = true;
   		}
   		else {
   			this.lrx = lrx;
   			this.lry = lry;
   		}
   		if (ulx > lrx || uly > lry) {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
   			error = true;
   		}
   	}   	   	
   	public void showArea()
   	{
   		if (error == true) {
   			System.out.println("좌표값 오류로 넓이를 계산할수 없습니다.");
   		}
   		else {
   			System.out.println("넓이 : " + (lrx-ulx)*(lry-uly));
   		}
   	}  	
}


class QuRectangle
{
   	public static void main(String[] args)
   	{
     		Rectangle rec = new Rectangle();
     		rec.ulx=22;
     		rec.uly=22;
     		rec.lrx=10;
     		rec.lry=10;
	

		//아래 생성자로만 객체생성후 초기화 되도록 처리한다...
		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
   	}
}

*/
class Rectangle {
	// 멤버변수
	private int ulx, uly;// 좌상단(upper left x, upper left y)
	private int lrx, lry;// 우하단(lower right x, lower right y)

	private Boolean isTrue = true;

	// 기본생성자
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	// 인자생성자
	public Rectangle(int ulx, int uly, int lrx, int lry) {
		if (isRange(ulx) == false || isRange(uly) == false) {
			System.out.println("좌상단 좌표범위가 잘못되었습니다.");
			isTrue = false;
		}
		if (isRange(lrx) == false || isRange(lry) == false) {
			System.out.println("우하단 좌표범위가 잘못되었습니다.");
			isTrue = false;
		}

		// 좌측 우측좌표값 뒤바뀐 경우 오류로 처리
		if (ulx >= lrx || uly >= lry) {
			System.out.println("좌/우측좌표지정이 잘못되었습니다.");
			isTrue = false;
		}

		this.ulx = ulx;
		this.uly = uly;
		this.lrx = lrx;
		this.lry = lry;
	}

	public boolean isRange(int point) {
		if (point < 0 || point > 100) {
			return false; // 0과 100의 범위를 벗어나면 좌표 오류
		} else
			return true;
	}

	public void showArea() {
		if (isTrue == false) {
			System.out.println("좌표값 오류로 넓이를 계산할수 없습니다.");
			return;
		}
		
		//좌표값을 구하여 넓이 계산
		System.out.println("넓이 : " + (lrx - ulx) * (lry - uly));

	}
}

class QuRectangle {
	public static void main(String[] args) {
		/*
		 * Rectangle rec = new Rectangle(); rec.ulx=22; rec.uly=22; rec.lrx=10;
		 * rec.lry=10;
		 */

		// 아래 생성자로만 객체생성후 초기화 되도록 처리한다...
		Rectangle rec1 = new Rectangle(1, 1, 10, 10);
		rec1.showArea();

		Rectangle rec2 = new Rectangle(-2, -2, 101, 101);
		rec2.showArea();

		Rectangle rec3 = new Rectangle(10, 10, 1, 1);
		rec3.showArea();
	}
}
