package chapter18practice.copy;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Customer {
	private final String name;
	private final String email;
	private final Address address;
	
	@Builder
	@Getter
	@ToString
	public static class Address{
		private final String street;
		private final String city;
		private final String postalCode;
	}

}
