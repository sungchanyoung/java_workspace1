package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 스트림 API
//: 컬랙션 데이터를 효율적으로 처리할 수 있는 기능을 제공 
//: 람다 표현식과 결합하여 직관적이며 간결한 코드 작성 
// cf)Arrays.asList =  일반 배열을 ArrayList로 반환 
// java.util.ArrayList로 반환 
//>>  원소를 추가/제거 메서드가 없음->사이즈를 바꿀수 X =사이즈 고정 

//=== 특징===
// 컬랙션 (collection 데이터를 간결하고 효율적으로 처리 
//- 데이터를 피렅링 매핑 ,축소 등의 작업을 용이하게 수해ㅑㅇ 
//- 함수형 프로그래밍 기법과 함께 사용 

//1 데이터 파이프 라인 
//: 스트림은 데이터를 소스로 부터 연속적으로 처리하는 파이프 라인을구축 
//: 데이터 변경X
//: 스트림은 원본 데이터 변경X ,새로운 값을 반환 
//: 3 지연처리 

//스트림 API의 기본 구성 요소 
//1. 소스 -스트림을 생성하는 단계 
//2. 중간 연산- 데이터 필터링 ,매핑하는 과정 , 연산을 연속적으로 사용 가능 
//3. 최종 연산 : 모든 데이터를 처리한 후 결과를 반환하거나 출력하는 연산 

public class D_String01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		for(int n: numbers) {
			if(n%2 ==0) {
				System.out.print(n);
			}
			System.out.println();
		}
		//람다 표현식
		numbers.stream() // 스트림으로 생성한다 
		.filter(n-> n%2 == 0)
		.forEach(System.out::println);
		
		//===스티림API ===
//		1.스트림 생성 
		List<String> names =  Arrays.asList("이승아","이도경","김명진");
		// .stream()으로 생성된 스트림은 일회성 사용만 가능!
		//>> 한번 사용한 스트림은 재사용X -중간 연산에서는 한번 
		Stream<String> stream = names.stream();
		
		Stream<String> filterStream =  stream.filter(name ->name.startsWith("이"));
		

		//3최종 연산 -> 처리를 와료하고 결과를 반환하거나 특정 작업을 수행 
		Stream<Integer>lengthStream = names.stream().map(String::length);
		System.out.println();
		lengthStream.forEach(System.out::println);
		
		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("김"))
				.collect(Collectors.toList());
		System.out.println();
		System.out.println(filteredNames);
		
		
		}
}
