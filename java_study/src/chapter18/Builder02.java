package chapter18;
//학생 클래스구현 
// private 필드 메서드 
// name age 필수 
// grade,major, 선택
//>>  생성자 4개 구현 
class student{
	private final  String name ;
	private final  int age;
	
	private String grade;
	private String major;
	
	private student(Builder builder) {
		this.name =builder.name;
		this.age =builder.age;
		this.grade = builder.grade;
		this.major = builder.major;
	}
	//빌더 클래스 정의 (클래스)
	public static class Builder{
		private final  String name ;
		private final  int age;
		
		private String grade;
		private String major;
		
		public Builder(String name, int age) {
			this.name =name;
			this.age=age;
		}
		public Builder grade(String grade) {
			this.grade=grade;
			return this;
		}
		public Builder major(String major) {
			this.major=major;
			return this;
		}
		
	}
//	public student(String name,int age) {
//		this.name =name;
//		this.age=age;
//	}
//	public student(String name,int age,String selectedField) {
//		this.name =name;
//		this.age=age;
//		this.grade =selectedField;
//	}
//
//	public student(String name, int age, String major,String grade) {
//		this.name =name;
//		this.age=age;
//		this.grade=grade;
//		this.major=major;
//	}
//	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
public class Builder02 {
	public static void main(String[] args) {
//		student st1 =new student("이승아",28,"1학년");
//		student st2 =new student("이도경",30,"2학년");
//		student st3 =new student("이승아",34,"3학년");
//		
//		System.out.println(st1.getAge());
//		System.out.println(st2.getGrade());
//		System.out.println(st3.getName());
		
		student std1 =new student.Builder("이승아", 28).build();
	}
}
