package chapter14.model;
//음식점 메뉴 주문 시스템 
//- 사용자가 메뉴를 선택 수량을 입력>>  총 계산을 계산 
// - 종료 옵션을 선택할 떄까지 반복하여 메뉴 선택을 받음 

import java.util.HashMap;
import java.util.Map;

// "메뉴" 객체
// : 메뉴 - 가격이 쌍으로 데이터 관리 
public class OrderModel {
	// 메뉴이름 (키) ,가격(값)으로 하는 HashMap
	private Map<String,Integer> menuPrices;
	private Map<String,Integer> order;
	private boolean  isComplete;
	
	public OrderModel() {
		menuPrices = new HashMap<String, Integer>();
		order =new HashMap<String,Integer>();
		isComplete =false;
		
		// 메뉴 가격을 초기화 
		menuPrices.put("pizza",22000);
		menuPrices.put("pizza",18000);
		menuPrices.put("Coke",2200);
		menuPrices.put("Ade",5000);
		
	}
		// 기능 정의 
//		1. 주문을 추가하는 메서드 
		public void addOrder(String dish,int quantity) {
			if(menuPrices.containsKey(dish)) {
				//주문 목록에 메뉴 추가 또는 이미  존재할 경우 수량을 업데이트 
				// getOrDefault(key,defaultValue)-map에서 사용한 메서드 
				// 찾는 key가 존재한다면 key의 value를 반환 
				//null이면 defaultValkue를 반환 
				order.put(dish, order.getOrDefault(dish, 0)+quantity);
			}
		}
//		2.총 주문 가격을 계산하는 메서드 
	public int calculateTotal() {
		int total =0;
		for(String dish : order.keySet()) {
			//주문 요리 -요리 이름(키)& 수량(값) 
			//메뉴판 -요리이름 &가격 
			total += order.get(dish) * menuPrices.get(dish);
			
		}
		return total;
	}
//		3. 주문 완료 상태를 설정하는 메서드 
	public boolean setComplete(boolean isComplete) {
		this.isComplete=isComplete;
		return isComplete;
	}
//		4.주문  완료여부를  반환하는 메서드 
	public boolean isComplete() {
		return isComplete;
	}
		
		
		
		
		
}
