package chapter16;
//익명 클래스 
//: 이름이 없는 클래스 -주로 일회성 객체를 생성할때 사용 
//: 클래스를 정의하면서 동시에 그 인스턴스를 생성 
//: 추상 클래스나 인터페이스 구현에 사용 

//:===기본 형태===
//new 추상클래스명 , 인턴페이스명(){ }

abstract class Example{
	abstract void display();
}
//A하는 이름을 가진 클래스 
class A extends Example{
	void display() {
		System.out.println("출력합니다");
	}
}
 
public class B_Anonymous01 {
	public static void main(String[] args) {
		A a1 =new A();
		A a2 =new A();
		A a3 =new A();

		Example a =new Example() {
			void display() {
				System.out.println("익명 클래스의 출력 ");
			}
		};
	
		a1.display();
		a1.display();
		a1.display();
		a.display();
	}
	
}
