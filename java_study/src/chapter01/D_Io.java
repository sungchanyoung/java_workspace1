package chapter01;

import java.util.Scanner;// 자바 내장  객체인 Scanner를 사용 

public class D_Io {
	// class내부의 실행을 담당하는 메인 메서드 
	public static void main(String[] args) {
	// 자바 입출력 
		System.out.println("안녕하세요");
	//Scanner -입력 소스로부터 데이터를 읽어올 수 있는 형태 
	Scanner sc = new Scanner(System.in);
//	sc.next();// 문자열로 반환
//	sc.nextLine();// Enter까지 전체 라인의 문자열로 반환 
//	sc.nextInt();// 정수
//	sc.nextDouble();// 실수 
	System.out.println("정수를 입력하세요");
	int age = sc.nextInt();
	sc.close();
	System.out.println(age);
	System.out.println("입력한 나이"+ age);
	String s = sc.next();//  -Error  스캐너 사용후 메모리 최적화를 위해 닫아줘야한다.
	System.out.println(s);
	//개행 문자 +버퍼 
	// nextInt()나 + nextDouble() 의 경우 
	// >>버퍼에 개행 문자가  입력으로 처리되는 문제가 발생 
	System.out.println("===논리 연산자  ===");
	
	System.out.println("and 연산자 &&");
	System.out.println(true && true);
	System.out.println(true && false);
	
	System.out.println("OR 연산자 ||");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println("! not연산자 부정 논리");
	System.out.println(!true);
	System.out.println(!false);
	
	}
}
