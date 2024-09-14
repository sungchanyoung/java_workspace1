package chapter01;

public class B_Data_Type {
public static void main(String[] args) {
	// 데이터 타입 (자료형,DataType)
	// 자바는 강 타입 언어 
	// 모든 변수 선언시 반드시 데이터 타입을 명시 
	// 1데이터 타입의종류 
	//: 기본 타입 - 변수 선언시 해당되는 자료형의 크기만큼 메모리에 할당(실질적인 데이터가 저장)
	// 종류(byte): byte(1),short(2), long(8),float(4), 
	//            boolean(1),int(4),char(2),double(8)
    //	참조 타입 - 객체의 참조 (메모리 주소를) 저장하는 변수 
	//2 기본 자료형 
	int age;
	age = 30; // 변수 초기화 
	int height =169;
	System.out.println(age);
	System.out.println(height);
	
	long bitNumber =100000000L;
	//문자형의 데이터의 경우 따옴표를 사용해 감싸야함 
	//- 2바이트 : 단일 문자 저장 
	
	//  참조 자료형 - 기본 자료형을  기초로 만들어진 자료형- 실제 데이터 값X, 데잍가 저장된 주소값을 가지는 자료형  
	char grade ='A';
	char lastName ='이';
	String name = "안녕라세여ㅛ";//String 
	int[] arr = new int[5];//Array
	
	
}
}
