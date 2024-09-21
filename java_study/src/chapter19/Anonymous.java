package chapter19;
//익명 클래스 
//: 클래스 종의 하면서 동시에 객체를 생성하는 방법 
//> 이름이 없기 때문에 제사용X, 일회성 사용 객체 정의에 유용 

//익명 클래스의 특징 
//1) 한번만 사용하는 인터페아스,추상 클래스 구현 
//2) 특정 로직을 캡슐화 -내부 클래스의 일종 
//3) 명시적 생성자 가질수 X

//=== 익명 클래스의 기본 형태 ===
// 인터페이스 또는 추상 클래스를 구현 
// new 인터페이스 _또는 추상 클래스(){
//	메서드 오버라이딩 및 클래스 구현 
//}

//익명 클래스의 장단점 
//1)장점 - 간결함- 클래스 선언과 인스턴스 생성이 동시적으로 처리 
//캡슐화 - 일회성 로직을 사용으로 특정 위치에서만 사용되고 외부에 노출X

// 단점 
//-여러개의 익명 클래수 사용시 코드의 가동석 저하 
// 이름이 없기 떄문에 디버깅에 어려움 
// 재사용 불가능 
interface Animal{
	void sound();//-추상 메서드 -구현{}이 옶는 메서드 
	//+) 익명 클래스에서 인터 페이스는 함수형 인터 페이스로 
}
//추상 클래스 구현 예시 
abstract class Vehicle{
	abstract void run();
}
//--익명 클래스 person정의 
abstract class Person{
	private String getName;
}
public class Anonymous {
	public static void main(String[] args) {
	
	Animal dog =new Animal() {
		
		@Override
		public void sound() {
			System.out.println("멍멍");
			
		}
	};
	dog.sound();
	Vehicle car =new Vehicle() {
		
		@Override
		void run() {
			System.out.println("자동차가 달립니다");
			
		}
	};
	car.run();
	Person person =new Person() {
		public String getName() {
			return this.getName();
			
		}
	};
	}
}
