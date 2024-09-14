package chapter07;

// 캡슐화
// : 객체 지향 프로그래밍에서 데이터와 해당 데이터를 처리하는 함수를
//   하나로 묶는 것을 의미
// - 객체 내부의 구현을 숨기고 외부에서는 제공된 메서드를 통해서만 접근할 수 있게 설정
// >> 데이터 보호, 유지보수성 향상, 사용자 편의성 증대

// getter & setter 메서드
// : 캡슐화 된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능

// - getter: 객체의 특정 필드 값을 읽는 메서드
// - setter: 객체의 특정 필드 값을 설정하는 메서드

// === 학생 정보를 관리하는 클래스 ===
class Student {
	private String name;
	private int age;
	private int score; // 점수 필드
	
	// getter & setter 메서드 - 캡슐화 되어 있는 데이터에 접근
	// : 메서드 형식을 get변수명, set변수명으로 지정하는 것을 권장
	
	public String getName() {
		// private 설정되어 있는 name 변수는 반드시
		// , getName() 메서드를 통해서만 외부에서 접근이 가능
		return name; // this 키워드가 생략
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("유효하지 않은 나이입니다.");
		} else {
			this.age = age;			
		}
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if (score > 0 && score < 100) {
			this.score = score;
		} else {
			System.out.println("유효하지 않은 점수입니다.");
		}
	}
}

public class C_Encapsulation {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		Student student1 = new Student();
		// student1.name = "이승아"; - Error
		
		student1.setName("이승아");
		student1.setAge(90);
		System.out.println(student1.getName()); // 이승아
		System.out.println(student1.getAge()); // 90
		
		student1.setAge(-10); // 유효하지 않은 나이입니다.

		// score 필드를 getter & setter 통해 설정
		// >> 점수값에 대한 유효성 검사 코드를 추가
		//    : 0 이상 100 이하
		// 85점 설정 > 출력
		student1.setScore(85);
		System.out.println(student1.getScore()); // 85
		student1.setScore(105); // 유효하지 않은 점수입니다.
	}
}