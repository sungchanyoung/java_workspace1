package chapter04;
class Car{
	String model;
	int year;
void  displayInfo() {
	System.out.println("model : "+model+ "year"+ year);
	}
/*
 * 클래스 생성자 
 * 클래스의 이름과 동일한 메서드 
 * 객체가 생성될 떄 자동으로 호출 
 * 클래스 내부의 필드를 초기화 할떄 주로 사용 
 */
Car(String model,int year){
	this.model  =model;
	this.year = year;
}
}

public class Example01 {
	public static void main(String[] args) {
		// 클레스명의 클래스의 새로운 객체를 생성  -> 해당 객체에 대한 참좆 주소를 클래스 타입의 변수에 저장 
		Car mycar = new Car("제네시스",2023);//객체 생성->객체 인스턴화 :new 연산자 사용 
//		객체를 사용해서 필드 접근 
		System.out.println(mycar.model);
		System.out.println(mycar.year);
	}
}
