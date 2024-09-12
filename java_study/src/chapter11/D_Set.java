package chapter11;
// SET 인터페이스 
// 중복된 요소를 포함하지 않은 객체의 집합 
//>.  객체의 저장 순서를 저장하지 않음 
//>> null 요소 포함 
// 종류 : HashSet, LLinkedHashset,TreeSet
// 1HashSet: 가장 많이 사용되는 set 구현채, 빠른 성능을 제공 
//>> 사입 순서나 요소의 정렬 상태를 보장 X
//>> 2.linkedhashset 
//:hashset에서 순서를 추가한 형태 
// 요소를 사입 순서대로 유지 

import java.util.HashSet;
import java.util.Set;

//treeset
//:정렬된 순서대로 요소를 유지 
// 요소의 순서가 중요하거나 정렬 상태를 유지해야 할 떄 사용 
// 자동 정렬 
public class D_Set {
	public static void main(String[] args) {
		//set -주요 메서드 
		//add,remove,contains,size,isEmpty
		
		Set<String>set =new HashSet<>();
		set.add("자바");
		set.add("파이썬");
		set.add("C++");
		set.add("자바스크립트");
		System.out.println(set);
		set.remove("자바");
		set.add("C++");
		System.out.println(set.size());
		System.out.println(set.contains("자바스크립트"));
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}
}
