package chapter13;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton singleton1 =new Singleton.getInstance();
		System.out.println(singleton1);
		Singleton singleton2 =new Singleton.getInstance();
		System.out.println(singleton2);
		if(singleton1 == singleton2 ) {
			
		}
	}
}
