package chapter09;
//인터 페이스vs추상화  = 하나 이상의 추상메서드를 포함 
interface PlayingCard{
	// public,default 가능하다 
	public static final int spade =4;
	final int DIAMOND =3;
	static int HEART =2;
	int CLOVER=1;
	
	public abstract String getCardNumber();
	String getCardKind();
	
	default void defaultMethod() {
		System.out.println("디폴트 메서드입니다");
	}
	static void staticMethod() {
		System.out.println("정적 메서드입니다");
	}
}
class Card implements PlayingCard{
	private String cardNumber;
	private String cardKind;
	
	public Card(String cardNumber, String cardkind) {
		this.cardNumber =cardNumber;
		this.cardKind=cardkind;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getCardKind() {
		return cardKind;
	}
	@Override
	public void defaultMethod() {
		System.out.println("Card 클래스에서 재정의된 디폴트 메서드입니다.");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Card card =new Card("7","Heart");
		System.out.println(card.getCardNumber());
		System.out.println(card.getCardKind());
		card.defaultMethod();
		PlayingCard.staticMethod();
		System.out.println(PlayingCard.CLOVER);
		System.out.println(PlayingCard.DIAMOND);
		System.out.println(PlayingCard.HEART);
		System.out.println(PlayingCard.spade);
	}
}
