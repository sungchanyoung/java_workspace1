package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_List {
	public static void main(String[] args) {
//	linkedList
//		1. Arraylist 사용예시 
//		new  생성자 사용하여 ArrayList객체를 생성 
//		>> 일반타입 X, 클래스 객체 데이터  타입 
//		 <String, Integer, boolean>
		ArrayList<String> strArray = new ArrayList<String>();
		strArray.add("자바");
		strArray.add("css");
		strArray.add("html");
		strArray.add("js");
		System.out.println(strArray.size());
		strArray.add(1,"React");
		System.out.println(strArray);
		strArray.get(1);
		strArray.remove(1);
		System.out.println(strArray.set(1, "c#"));
		System.out.println(strArray);
		
		// linkedlist 사용예시 
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList .add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		System.out.println(linkedList);
		
		System.out.println(linkedList.contains("Orange"));
		System.out.println(linkedList.contains("Strawberry"));
		linkedList.clear();
		System.out.println(linkedList);
//		cf) list 컬략션 프레임 워크 
//		1getm remove, set 사용시 
//		 인덱스 번호를 사용하는 메서드 
		
		
	}
}
