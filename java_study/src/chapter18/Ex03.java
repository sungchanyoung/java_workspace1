package chapter18;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter

class Animal{
	private String name;
	private String info;
	private String  feed;
	
	
}
public class Ex03 {
	public static void main(String[] args) {
		Animal a1 = Animal.builder()
				.name("사자")
				.info("포우류")
				.feed("고기")
				.build();
	}
}
