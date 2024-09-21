package chapter18practice;

import java.util.Arrays;
import java.util.List;

//1)product 클래스
public class Main {
	public static void main(String[] args) {
		//1.product 객체 생성 
		Product pd1 = Product.builder()
				.name("삼성 북 4")
				.price(1200.10)
				.description("삼성 북 시리즈 네번쨰 모델")
				.build();
		Product pd2= Product.builder()
				.name("갤럭시 s24")
				.price(670.10)
				.description("삼성핸드폰 ")
				.build();
		//2. Customer 객체 생성 (중첩된 address 객체 포함)
		Customer.Address address1 =Customer.Address.builder()
				.street("전포대로")
				.city("부산")
				.postalCode("12345")
				.build();
		Customer customer =Customer.builder()
				.name("이승아")
				.email("dev")
				.address(address1)
				.build();
		
	List<Product> products =Arrays.asList(pd1,pd2);
	double totalPrice = Order.calculateTotalPrice(products);
	System.out.println(totalPrice);
	
	Order order =  Order.builder()
			.orderId("OR123")
			.customer(customer)
			.products(products)
			.totalPrice(totalPrice)
			.build();
	System.out.println(order);
	
		
	}
}
