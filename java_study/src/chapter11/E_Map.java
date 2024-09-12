package chapter11;

import java.util.HashMap;
import java.util.Map;

// Map의 인터페이스 
//: 키와 값의 쌍으로 요소를 저장하는 데이터 구조 
//: 키는 고유한 데이터(하나의 값을 )가짐 
// map의 주요특징
//키의 유일성 
//: 값의 중복성 
// 순서 보장 X

//1 HashMap
// 해시테이블을 사용하여 키-값 쌍을 저장 
// 순서 유지X
//null 허용(키,값 모두 허용 )

//linkedHashMap

//Map  컬랙션 선언 방법 ==
// Map <키타입, 값타입>인스턴스명  = new Hashmap<키 타입,값 타입>();
// 래퍼 클래스 (Wrapper Class): 기본데이터타입을 객체로 다루기 위헤 사용 
public class E_Map {
	public static void main(String[] args) {
		Map<String,Integer> students = new HashMap<>();
		students.put("이승아", 30);
		students.put("이도경", 30);
		students.put("김명진", 34);
		
		System.out.println(students);
		System.out.println(students.get("이도경"));
		students.remove("이승아");
		System.out.println(students);
		System.out.println(students.containsKey("이도경"));
		System.out.println(students.containsKey("이지훈"));
		System.out.println(students.size());
		System.out.println(students.keySet());
		System.out.println(students.values());
		
		
	}
}
