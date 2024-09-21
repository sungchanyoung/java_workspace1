package chapter04;
// 클래스 구조 : 필드 ,메서드 ,사용자
class car{
	String model;
	int year;
	car(String modelName, int year){// 매개변수 
		//this키워드 : 클래스의 필드와 생성자로 받아오는 데이터의 이름이 같을 경우 구분을 위해 사용 
		model =modelName;
		this.year = year;
	}
	void displayInfo() {//void 메서드명  = 리턴값이 없는 메서드 
		System.out.println("model"+ model+ "year : "+"year");
	}
}
	//클래스 의 행동 (메서드)

	//: 클래스 내부에서 정위된 함 객체 행동을표현 
	// 클래스의 해당 값을 변경 가능, 값을 반환 
	
//void - 해당 메서드 반환하는 결과X
	//반환이 존재하지 않을경우 메서드명 앞에 반드시 필요


public class Object03 {
	public static void main(String[] args) {
		// 객체 생성 (객체 생성 - 객체 인스턴스화)
		//new 연산자를 사용 
		//클래스 생성자를 호출 - 객체의 초기 상태를 설정
		car mycar = new car("제네시스",2024);
		// 객체 사용 
		//1. 필드 접근 (. 연산자 사용)
		System.out.println(mycar.model);
		System.out.println(mycar.year);
	}
}


