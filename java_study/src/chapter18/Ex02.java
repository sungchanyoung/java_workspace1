package chapter18;
//빌더 패턴 없이  rngis 
class Teacher{
	private final String  name;
	private final int  age;
	private String info;
	private String subject;
	
	private Teacher(Builder builder) {
		this.name= builder.name;
		this.age= builder.age;
		this.info= builder.name;
		this.subject= builder.subject;
	}

	public  static class Builder{
		private final String  name;
		private final int  age;
		private String info;
		private String subject;
		
	
	public  Builder(String name, int age){
		this.name =name;
		this.age =age;
	}
	public Builder info(String info) {
		this.info = info;
		return this;
	}
	public Builder subject(String subject) {
		this.subject = subject;
		return this;
	}
	public Teacher build() {
		return new Teacher(this);
	}
	
	public int getAge () {
		return age;
	}
	public String getInfo() {
		return info;
	}
	public String getSubject() {
		return subject;
	}
	}

	public String getName() {
		return name;
		
		
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
Teacher std1 = new Teacher.Builder("이승아", 28).build();
		
		Teacher std2 = new Teacher.Builder("이도경", 30)
				.info("1학년")
				.subject("회계학과")
				.build();
		
		Teacher std3 = new Teacher.Builder("이지훈", 16)
				.info("3학년")
				.build();
		
		Teacher std4 = new Teacher.Builder("이지희", 19)
				.subject("심리학과")
				.build();
		
		System.out.println(std1.getName());
		System.out.println(std2.getName());
		System.out.println(std3.getName());
		System.out.println(std4.getName());
	}
}
