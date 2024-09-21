package chapter19;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
// Data :모든 필드에 대한  getter와 setter,equals toString등 생성 
//>>클래스의 여러 메서드가 생성 
public class Phone {
	private String model;
	private Integer number;
	
}
