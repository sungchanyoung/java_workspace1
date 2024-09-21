package chapter18;
// 빌더 (Builder)
//복잡한 객체 생성을 단순화하는 생성 패턴 
// - 객체 생성자 인수가 많을때 가독성이 떨어지는 문제를 보안 
// 체이닝 방식을 사용하여 가독성 있고 유여한 객체 생성 

import chapter18.Product.Builder;

//:디자인 패턴 
// 소프트웨어 공학에서 자주 발생하는 문제에 대한 재사용 가능한 해결책
// 생성,구조 행위 패턴
// 빌더 패터은 :생성패턴에 포함 

//1 빌더 패턴 구조 
// 1) Buliler 클래스 생성 :객체의 생성을 담하는 내부 클래스 

// 2) 필수 속성 설정 : 생성자를 통한 필수 속성을 설정 

// 3) 선택적 속성 설정 : 체이닝 방식으로 선택적 속성을 설정할 수 있는  메서드 추가 

// 4) build메서드 추가 : 최종족으로 객체를 반환하는 메서드 

//2.빌더 패턴의 특징
// -가독성 & 유연성 확장 
// - 불변 객체 생성 가능 
// : 생성된 객체는 변경할 수 없는 객체로 안정성을 보장 받음 

class Product{
	//피수 속성 
	String name;
	int price;
	//선택적 속성
	String description;
	String manufacturer;
	
	//
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	private Product(Builder builder) {
		this.name = builder.name;
		this.price =builder.prices;
		this.description = builder.description;
		this.manufacturer=builder.manufacturer;
	}
	public static class Builder{
		//필수 =final-값을 할당 
		private final String name;
		private final int prices;
		//선택적 속성
		private  String description;
		private  String manufacturer;
		
		//필수 속성을위한 빌더 생성자
		public Builder(String name, int prices) {
			this.name=name;
			this.prices=prices;
		}
		
		public Builder description(String description) {
			this.description=description;
			//this :해당 클래스로 인스턴스화 된 객체 그자체
			return this;
		}
		
		public Builder manufacturer(String manufacturer) {
			this.manufacturer=manufacturer;
			//this :해당 클래스로 인스턴스화 된 객체 그자체
			return this;
		}
		//최종적으로 Product 객체 반환 
		public Product build() {
			return new Product(this);
		}
		
	}
}

public class Builder01 {
	public static void main(String[] args) {
		//빈제품 객체를 인스턴스화 
//		Product product1 =new Product();
//		product1.setName("아이폰");
//		System.out.println(product1.getName());
		//a)필수 속성만 설정한 Product 객체 생성 
		Product pd1 =new Product.Builder("아이폰", 20).build();
		System.out.println(pd1.toString());
		//선택적 속성을 설정한 Product객체 생성 
		Product pd2 =new Product.Builder("갤럭시", 18);
				.description("갤럭시 핸드폰");
				.manufacturer("삼성");
				.build();
	}


}
