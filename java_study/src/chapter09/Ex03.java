package chapter09;
interface Example2{
	int EXAMPLE_VARIABLE =10;
	void printVar();
	default void method() {
		System.out.println("예시1");
	}
}
interface Example3 {
	void printVar1();
	default void method() {
		System.out.println("예시2");
	}
}
// 다중 인터페이스 구현 
class ExampleGroup implements Example2,Example3{

	@Override
	public void printVar1() {
		System.out.println(EXAMPLE_VARIABLE);
	}

	@Override
	public void printVar() {
		System.out.println("다중 인터페이스");
	}
	@Override
	public void method() {
		System.out.println("Method , 중복되는 디폴트 메서드");
	}
	
}
public class Ex03 {
	public static void main(String[] args) {
		ExampleGroup exg =new ExampleGroup();
		exg.printVar();
		exg.printVar1();
		exg.method();
		Example2 exInterface = exg;
		exInterface.printVar();
		exInterface.method();
	}
}
