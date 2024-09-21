package Etc;

public class Main {
	public static void main(String[] args) {
		Ex01 singleton = Ex01.getInstance();
		System.out.println(singleton);
		Ex01 singleton1 = Ex01.getInstance();
		System.out.println(singleton1);
	
		if(singleton == singleton1) System.out.println("덩일한 싱글톤");
		else System.out.println("다른 싱글톤 ");
	}
}
