package otherPackage;

public class ParrentClass {
	public String publicField;
	
	protected String protectedField;
	
	// == default ==
	public ParrentClass() {
		this.protectedField = "안녕하세요";
	}
	
	protected void exampleMethod() {
		System.out.println("상속받은 클래스에서 호출 가능");
	}
}