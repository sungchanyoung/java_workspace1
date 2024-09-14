package chapter16;
class School{
	private String name;
	public School(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	class Student{
		private String studentName;
		private int studentId;
		
		public Student(String studentName, int studentId) {
			this.studentName=studentName;
			this.studentId=studentId;
		}
		public void displayInfo() {
			System.out.println("학교"+name);
			System.out.println("학생이름"+studentName);
			System.out.println("학생id"+studentId);
		}
		
	}
	class Teacher{
		private String teacherName;
		private String subject;

		public Teacher(String teacherName,String subject) {
			this.teacherName =teacherName;
			this.subject=subject;
		}
		public void displayInfo() {
			System.out.println("학교"+name);
			System.out.println("교사이름"+teacherName);
			System.out.println("과목"+subject);
		}
	}
}
public class A_Inner02 {
	public static void main(String[] args) {
		School school =new School("유성 초등학교");
		School.Student student =  school.new Student("홍길동", 1001);
		School.Student student1 = school.new Student("고길동", 1002);
		
		// 교사 객체 생성 
		School.Teacher tacher1 = school.new Teacher("김준일", "수학");
		School.Teacher tacher2 = school.new Teacher("서지훈", "영어");
		student.displayInfo();
		student1.displayInfo();
		tacher1.displayInfo();
		tacher2.displayInfo();
	}
}
