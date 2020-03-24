package common;

public class Student extends Person {

	public String stNumber;

	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", 학번 : " + stNumber;
	}

	@Override
	public void showInfo() {
		System.out.println("학생의정보");
		System.out.println(getInfo());
	}

	@Override
	public boolean equals(Object obj) {
		Person comparePerson = (Person) obj;

		if (comparePerson.name.equals(this.name)) {
			System.out.println("오버라이딩한 equals()메소드 호출됨 : " + this.name);
			return true;
		} else {
			return false;
		}
	}
}
