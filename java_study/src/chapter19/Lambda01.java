package chapter19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//람다 표현식 :익명 함수를 간결하게 표현하는 방법 (가독성,간결성 )
//람다의 기본 형식 : (매개변수) -> {실행할 코드}
public class Lambda01 {
/*
 *매개변수 변수 ,반환 값이 없는 함다  
() -> System.out.println("hellow world")
2) 매개변수 하나인 람다 
	x -> x*y;
3) 매개변수 두개이상 
	(a,b) ->  a+b;
 Runnable  : 반환값이 없는  작업을 실행할 때 사용 
 comparator <T> :두 객체를  비교하는 메서드를 정의하는 인터페이스 
Function <T,R> :입력값을 받아  다른 타입의 결과값을 반환하는 함수형 인터페이스 

predicate<T>조건 검사하는 역할 
 
 */
	public static void main(String[] args) {
	
	Runnable r =() -> {
		System.out.println("프로그램 실행 ");
	};
	r.run();
	
	Comparator<Integer> comoarator = (x,y) -> x-y;
	//두가지 객체를 비교하여 나온 결과값으로 오름차순 정렬  
	
	System.out.println(comoarator.compare(10, 20));
	List<Integer> numbers =Arrays.asList(5,3,8,1,2,7);
	Collections.sort(numbers, comoarator);
	System.out.println(numbers);
	
	//문자열을 정수로 변환하는 람다식
	Function<String, Integer>fx = s -> Integer.parseInt(s);
	Integer num = fx.apply("10");
	System.out.println(num);
	//addthen 메서드: 사용후 반환값을 활용 
	Integer num2 = fx.andThen(result -> result+100)
			.apply("10");
	System.out.println(num2);
	
	Predicate<Integer> even = n -> n%2 ==0;
	System.out.println(even.test(10));
	System.out.println(even.test(11));
	
	Supplier<Integer> role  = () -> {
		Integer result = num +999;
		return result;
	};
	//get 메서드로 반환값 출력 
	System.out.println(role.get());
	
	//Consumer 인터페이스 : 하나의 매개변수를 받고 아무결과도 반환하지 않은 작업 
	Consumer<String> transform =s ->{
		System.out.println(s+ " 서버에 접속 완료");
		System.out.println(s+ " 님 환영합니다");
	};//accept메서드 :실행 인자로 전달 
	transform.accept("이승아");
	}
}
