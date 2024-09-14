package chapter13;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
//@Data 어노테이션은 모든 멤버 필드에 대한 게터 세터,toString ,equals 메서드 생성 ,
@Data 
@ToString
@Getter
@Setter
public class Example {
	private String name;
	private int age;
	//public Example(){}
	// public Example(모둔 멤버필드에 대한 매개 변수 ){모든 필드의 초기화}
	//Example exam1 =new Example();
	//Example exam2 =new Example("이승아", 50);
	
}
