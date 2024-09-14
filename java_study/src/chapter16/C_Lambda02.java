package chapter16;
// 람다 표현식 
//: 익명 함수를 간결하게 표현 , 한 번만 사용되는 함수를 정의 
//> 코드 양을 줄이고 가독성을 향상 

//기본 구조=
// (매개 변수 목록) -> {함수 본문 }
//(int x int y) ->{return x+y}
// 람다 표현식의 축약
// 중괄호 생략 
//반환문 생략 
// 매개변수 타입 생략 가능 
// 활용 
interface Example1{
	String message(String msg);// 추상 메서드
}
public class C_Lambda02 {
	public static void main(String[] args) {
		Example1 hello = (a) ->{ return a; };
		System.out.println(hello.message("안녕하세요"));
	}
}
