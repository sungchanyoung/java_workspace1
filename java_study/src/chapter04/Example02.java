package chapter04;
//클래스 생성 속성두개 기능 하나 선언 ,필드 초기화 까지 
class Computer{
	String brand;
	int pirces;
	boolean  isOperate;
Computer(String brand, int prices, boolean isOperate){
	this.brand =brand;
	this.pirces =prices;
	this.isOperate = isOperate;
	
}
void computerInfo() {
System.out.println(brand+ pirces+ isOperate);


	
	}
}
public class Example02 {
	public static void main(String[] args) {
		Computer com =new Computer("SamSung", 1500000, false);
		Computer com1 =new Computer("APPLE", 2500000, true);
		
		if (com.isOperate == true) { 
			System.out.println("아주굿이야");
			}
		com.brand = "라이젠";// 클래스 변수 .속성  =  값 변경 
		System.out.println(com.brand + com.pirces +com.isOperate );
		System.out.println(com1.brand+" " + com1.pirces +" "+com1.isOperate );
	}
}
