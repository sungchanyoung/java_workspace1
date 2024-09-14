package chapter04;
class CarClass1{
	String color;
	int speed;
	String brand;
	//정적 변수 -static  붙힘 
	static int tirNumber =4;
	static int  doorNumber=4;
	void accelerate(int increment) {
//		increment -지역변수 : 메서드가 실행되는 동안에만 존재하는 일시적인 변수 
		speed+=increment;
	}
}
public class Example03 {
	public static void main(String[] args) {
		CarClass1 car1 = new CarClass1();
		car1.speed =100;
		car1.accelerate(200);
		System.out.println(car1.speed);
	}
}
