package chapter04;
// 객체 지향 프로그램의 '변수'

// 필드 VS 지역 변수 

//필드(속성)
//: 객체의 지속적인 상태를 저장하는 클래스 내부의 변수 

// 지역변수()  : 메서드가 실행되는 동안에만 존재하는 일시적인 변수 

//인스턴스 변수 : 클래스의 각 객체(인스턴스)에 변수 
//>> 클래스 내부에서 선언, 객체가 생성될 떄 메모리에 할당 

//클래스 정적변수 -static키워드 사용하여 선언되는 변수 
//클래스의 모든 인스턴스에서 공유되는 데이터 
//>> 프로그램이 시작될때 생성 프로그램이 종료될때 소멸(메모리에 할당)
class CarClass{
	//인스턴스 변수 :각 객체(인스턴스) 마다 다른 값을 가짐 
	String color;
	int speed;
	String brand;
	// 정적 변수: 해당 클래스로 생성되는 모든 객체가 동일한 값을 가짐 
	// 데이터 타입 앞에 static키워드 사용
	
	// 변수 선언과 동시에 공유될 값을 초기화 
	static int tireNumber =4;
	static int doorNumber=4;
	void accelerate(int increment) {
		// increment는지역변수이다 
		// >> 메서드 내부에서만 유효 
		speed += increment;
	}
}

public class Object05 {
	public static void main(String[] args) {
		CarClass car1 =new CarClass();
		// 객체의 인스턴스 변수 
		car1.brand = "kia";
		car1.color = "black";
		
		// 객체의 클레스 변수 -클래스 .변수
		//>>클래스변수는 클래스명으로 접근을 권장 
		System.out.println(CarClass.tireNumber);
//		System.out.println(car1.doorNumber); 이렇게 사용하는 방법은 권장하지 않음 
//		car1.tireNumber = 6;
//		System.out.println(car1.tireNumber);
		
		System.out.println(car1.brand);
	}
}
