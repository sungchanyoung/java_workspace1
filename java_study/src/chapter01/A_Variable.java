package chapter01;

public class A_Variable {
public static void main(String[] args) {
	//번수 :Variable
    // 데이터를 저장할 수 있는 메모리 공간 
//	1. 변수선언 - 메모리 공간 생성
// 변수 선언 방법  -  데이터 타입 변수명 ;
	// 변수 초기화 방법 (그릇에 데이터 넣기 )
	// 변수명  = 데이터 값;
	// 변수 선언 과 동시에 초기화 
	// 데이터 타입 변수명  = 데이터 값;
	// 2. 변수 명명 규칙 
	// 문자 ,숫자, 규치 
	// : 문자 숫자 기호를 사용 
	// 대소문자 엄격히 구분 
	// 숫자로 시작할 수 없다 
	// -기호는 _(언더 스코어 ), $(달러)만 가능 
	// -lowerCamelCase
	// 자바의 예약어 키워드 는 변수명으로 사용 
	//+) 전체 대문자 사용을  금함 (상수 와의 구분을 위해 )
	int num =10;
	char chr1 = '가';
	Boolean boo1 = true;
	// 상수에 (Constant)
//	 : 프로그램 실행 동안 그 값이 변경되지 않는 변수 
//	>> 선언과 동시에 반드시 ! 초기화 이뤄어져야 함 
	// 상수 선업 방법 
	// -final키워드를 ㅣ사용하여 상수 선언 
	// final 데이터 타입 상수명  = 데이터 값;
	//2. 상수명명 규칙 
	 // 보통 대문자로 명명 
	// EX)PI, PSIDENT_NUMBER
	final float PI = 3.14159f;
	final int PSIDENT_NUMBER =1234567;
 }
}
