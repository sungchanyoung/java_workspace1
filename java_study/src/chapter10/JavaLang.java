package chapter10;
// java.lang 
//: 자바 프로그램의 가장 기본적인 클래스들을 포함 
// >>import문 없이 사용 가능 
//1)Object 클래스 
// 자바의 모든 클래스의 최상위 클래스 ,기본적으로 생략 
class MyClass extends Object{
	//toString()메서드 - 객체의 문자열 표현으로 반환 
	// equals() 메서드 - 두 객체가 동등한지 비교 
	public MyClass(int id, String name ) {
//		int id;
//		String name;
	}
}//hell
//2) math클래스 
// : 수학적 연산 & 함수 제공하는 클래스 
//>> 모든 필드와 메서드가 static
//3) String 클래스  
public class JavaLang {
	public static void main(String[] args) {
		System.out.println("===========Math 클래스============");
		
	// abs 절대 값 반환 
	double result1 =Math.abs(-3.5);
	System.out.println(result1);
	
	//max(데이터1, 데이터2) , min(a,b) = 최댓값 최솟값 반환 
	System.out.println(Math.max(1231, 1240));
	//sqrt(데이터) : 제곱근 반환 
	// random() 0~1.0 사이의 난수  반환 
	
	// String 클래스 
	// length();
	// substring (int 시작 인덱스 ,int끝인 인덱스 )부부누 문자열 반환 
	}
}
