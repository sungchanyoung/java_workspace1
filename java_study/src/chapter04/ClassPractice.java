package chapter04;

class Card{
	int number;
	String kind;
	//클래스 변수 :모든 카드가 공유할 데이터 
	static int width =100;
	static int height =250;
	
}
public class ClassPractice {
	public static void main(String[] args) {
		//static만 접근 가능 
		System.out.println(Card.height);
		System.out.println(Card.width);
		// 클래스 Card의 객체(인스턴스)생성 
		Card c1 = new Card();
		c1.kind="Spade";
		c1.number = 7;
		System.out.println(c1.kind+ c1.number);
		// 인스턴스를 통한 클래스변수에 접근은 가능하지만 인스턴스 변수와의 
		// 혼돈을 막기위해 클래스명으러 호출을 권장 
	}
}
