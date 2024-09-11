package chapter10;
// 자바 예외 처리 

//예외 (Exception)
//프로그램 실행 중에 발생할 수 있는 예기치 못한 문제나 조건 
// 예외 처리 
// 예외가 발생할 경우 프로그램이 증단되지 않고 대응하여 정상적인 흐름을 유지하는 프로그래밍 기법
// 자바 예외 클래스 ===
//  Throwable 모든 예외와 오류의 최상위 클래스 
// 모든 예외 클래스는 해당 클래스를 상속받음 
// >> 예외와 관련된 메시지, 처리방법에 대한 예시 정보를 포함 

//1) Exception  - 예외 
// - 프로그램 처리할 수 있는 예외들의 클래스 
//: 예외 처리를 통해 개발자가 처리할 수 있는 문제들을 정의 
//1-1) Checked Exception 
//: 컴파일 시점에 체크되는 예외 -코드 작성하는 도중 
// 반드시 처리해야할 오류 
//컴파일러는 해당 예외가 처리되어 있지 않을경우 오류를 발생 

//1-1) Runtime(Unchecked) Exception 
//런타임 시점에 발생되는 예외 
//개발자의 실수로 발생 
// 컴파일러 강제하지 X (체크하지 X)

//===자바 예외처리 방법
// try-catch블럭,throws 키워드, 사용자 정의 예외 
//2) Error 시스템 레벨에서 발생하는 예외 ,개발자가 처리할 수X-메모리 부족 ,네트워크 연결 
public class Exception01 {
	public static void main(String[] args) {
		System.out.println('a');
		System.out.println("A");
		try {
			int division =10/0; 
			
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없다");
		}
	}
}
