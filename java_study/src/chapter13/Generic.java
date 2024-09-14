package chapter13;
// 자바 제네릭 
//: 클래스나 메서드를 정의할때 사용할 데이터 타입을 미리 지정하는 대신
//>> 구체적인 사용시 타입으로 대체 
//>> 특정 타입에 의존하지 않고 다양한 타입을 지원하는 클래스또는 메서드 설계
class Message<T>{
	private T message;

	public T getMessage() {
		return message;
	}

	
	
}
class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key =key; 
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	// 제네릭 메서드 
	// (접근 제한자 static)<제네릭> 반환타입 메서드명();
	static <T> void print(T value) {
		System.out.println(value);
	}

	
}
// 제네릭 와일드 카드 ===
// ? 기호를 사용 
// 제네릭타입을 불 특정하게 사용하도록 지정 
// 주로 클래스간에 상속 관계인 경우 사용 
public class Generic {
		public static void main(String[] args) {
			Pair<String,Integer> pair = new Pair<>("안녕하세요",123);
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
			Pair.print("반갑습니다");
			
			Message<?> m1;
			Message<String> m2 = null;
			m1 =new Message<>();
			String s = (String)m1.getMessage();	
			Boolean b = (Boolean)m1.getMessage();
			
			//제네릭의 한계  
			// 기본 타입가 함계 사용할수 X
			//반드시 참조 타입으로 사용 
			}
}
