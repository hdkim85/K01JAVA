package ex13interface;

/*
추상클래스
-상속을목적으로 제작되므로 객체 생성을 허용하지 않는다.
-추상클래스는 대부분 추상메소드를 포함하고 있으므로, 이를
상속받는 클래스는 반드시 추상메소드를 오버라이딩해야한다.
-클래스의 상속관계에서의 설계도 역할을 한다.
- 객체 생성은 할 수 없으나 그 외 참조변수, 상속 등의 모든 기능을 가지고 있다.
 
 추상메소드
 -오버라이딩의 목적으로 만들어진다.
 -함수의 실행부가 없기 때문에 {} 를 쓰지 않고 함수의 원형에 ;를 붙여 준다.
 */

//프로젝트 전체에서 기준이 될 수 있는 추상클래스 정의
abstract class PersonalNumberStorageAbs{
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonalInfo(String juminNum);
}
/*
 사람의 정보를 저장할 용도의 DTO클래스, 혹은 VO클래스라고 한다.
 */
class PersonalInfoDTO{
	private String name;
	private String juminNum;
	
	public PersonalInfoDTO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}

	public String getName() {
		return name;
	}

	public String getJuminNum() {
		return juminNum;
	}
	
	
}

/*
 제공된 추상클래스를 상속하여 사람의 정보를 저장하는 기능과,
 검색의 기능을 구현한 클래스.
 */
class PersonalNumberStorageExt extends PersonalNumberStorageAbs{
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	
	
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	/*
	 전달 받은 인자를 통해 PersonalInfoDTO 객체를생성 후 객체 배열에
	 저장한다.
	 */
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] =
				new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;
	}
	/*
	 주민번호를인자로 전달 받아 객체배열에 저장된 정보를 검색한 후 
	 일치하는 경우에만 이름을 반환한다.
	 */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i = 0; i < numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
			{
				return personalArr[i].getName();
			}
		}
		return null;
	}
}
public class E02AbstractToInterface1 {

	public static void main(String[] args) {

		PersonalNumberStorageExt storage = 
				new PersonalNumberStorageExt(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}

}
