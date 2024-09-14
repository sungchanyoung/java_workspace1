package chapter01;

public class C_TypeConversion {
// 자료형 변환 다른 타입으로 바꾸는 것 
	//byte(1) -short(2) -int (4) - long(8) - float(4)- double(8)
	public static void main(String[] args) {
	//1 자동 형 변환  - 작은 범위 타입을 큰타입으로 넣을때 는 
	// 컴파일러가 자동으로 형 변환
	byte smallBowl =10;
	int bigBowl = 10000;
	bigBowl = smallBowl;
	
	byte a= 32;
	short b=a;
	int c =b;
	long d =c;
	float e=d;
	double g =e;
	int number =1234;
	float fNumber1 = number;// 값이 손실이 일어나지 않음 
	float fNumber2 = 3.14f;
//	int fNumber3 = fNumber2;// 실수를 정수로 타입 변환시 오류 
	
	//2 강제 형 변환(명시적 ) - 크기가 작은 자료형의 변환 
	int number2 = (int)fNumber1;
	//실수를 정수로 변환시  - 소수점 이항의 데이터가 버려짐 
	
	// char 자료형의 형 변환 (char :2b)
	char a1 ='a';
	char a2 = 97;// 아스킨 코드 값 
	char a3 ='\u0061';// 유니코드 값
	System.out.println(a1);	
	System.out.println(a2);	
	System.out.println(a3);	
	char example ='가';
	System.out.println((int)example);// 3032
	System.out.println((int)example+1);// 3033
	System.out.println((char)((int)example+4));// 각 
}
}
