package chapter16;
//내부 클래스 :  다른 내부에 선언된 클래스를 의미 
//>>  장점
// 코드의 가독성 향상 - 코드의 구조 파악에 용이 
// 클래스 간의 관계를 명확하게 함
// 종류 
// 1. 비정적 내부 클래스: 외부클래스의 인스턴스에 속함 
// > 비정적 외부 클래스의 인스턴스 변수 및 메서드에 직접 접근 

// 2.정적 내부 클래스 : 외부 클래스의 정적 멤버 , 외부클래스의 인스턴스 변수에 접근 X
// 외부 클래스의 정적 멤버에만 접근O
// new 생성자 초기화 가능하다

// 3. 메서드  내부 클래스(지역 클래스)
//: 메서드 내에 정의된 내부 클랴스 , 해당 메서드 내에서만 사용 가능
//>> 메서드의 지역변수에만 접근 가능 
// 로컬 변수가 final인 경우에만 접근 가능 
class OuterClass{
	private String outerField = "외부 클래스의 필드 ";
	static String  staticField = "외부 클래스 스태틱 필드";
	//내부 클래스 - 인스턴스 필드 ,인스턴스 메서드 처럼 사용 
	class InnerClass{
		void diplay() {
			System.out.println("외부 클래스 필드에 접근 "+ outerField);
		}
	}
//	내부 클래스 -정적 내부 클래스 
	static class StaticClass{
		void display() {
//			System.out.println("외부클래스 필드에 접근(인스턴스): " +outerField);
			System.out.println("외부 클래스 필그에 접근(정적) " + staticField );
		}
	}
	// 메서드 내부 클래스 
	void outerMethod() {
		final String localVar ="로컬 변수 ";
		
		class MethodClass {
			void display() {
				System.out.println("로콜 변수에접근 "+ localVar);
			}
		}
	}
	
}
public class A_Inner01 {
	public static void main(String[] args) {
		// 외부 클래스 인스턴스화 
		OuterClass outer1 =new OuterClass();
//		2) 외부 클래스.내부클래스 형식으로 내부 클래스 생성 
		// 외부클래스 타입.내부클래스타입  변수  = 외부 인스턴스 new 내부클래스();
		OuterClass.InnerClass inner = outer1.new InnerClass();
		inner.diplay();// 외부 클래스 필드에 접근 : 외부 클래스의 필드 
		
		//===정적 내부 클래스 (스태틱 클래스)
		// 1) 외부 클래스 타입. 내부 클래스 타입 변수 =new 외부클래스 .내부 클래스 
	
		OuterClass.StaticClass staricInner = new OuterClass.StaticClass();
		
		//== 메서드 내부 클래스 (지역 클래스)===
		
		// 익명  내부클래스*** ====
		// 주로 인터페이스 추상 클래스에 구현에 사용 
		// 즉시 객체 생성 가능 
		// 주로 클래스 
	} 
}
