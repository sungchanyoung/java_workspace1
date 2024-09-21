package chapter04;

class Ecample {
	int instanceValue;
	static int classValue;
}
class Counter{
	static int count =0;
	Counter(){
		count++;
	}
}
public class Object06 {
	public static void main(String[] args) {
// 클래스 변수 VS  인스턴스 변수 
// 형태
// 필드 (속성,멤버 변수)중에 static이 붙은 것은 클래스 변수 ,
//	붙지 않은 것은 인스턴스 변수 
// 생성 시기 &&사용시기 
//	1.클래스 변수 
//  클래스가 메모리에 올라갈떄 
//	객체 생성 이전에도 사용 가능 
//	2.인스턴스 변수 
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
		
		System.out.println(c3.count);//5
		
		new Counter();
		new Counter();
		new Counter();
		new Counter();
	
		System.out.println(Counter.count);//9
	}
}
