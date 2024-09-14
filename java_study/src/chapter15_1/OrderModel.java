package chapter15_1;
import java.util.*;
public class OrderModel {
// 음식점 메뉴 주문 시스템 
//  - 사용자 메뉴 선택 , 선택 수향을 입력 >> 총계산 
	private Map<String, Integer>menuPrices;
	
	private Map<String, Integer> order;
	private boolean isComplete;
	
	public OrderModel(){
		menuPrices =new HashMap<String,Integer>();
		order =new HashMap<String,Integer>();
		isComplete=false;
		
		menuPrices.put("Pizza", 22000);
		menuPrices.put("Pasta", 18000);
		menuPrices.put("Coke", 2000);
		menuPrices.put("Ade", 5000);
	}
	
		public void addOrder(String dish,int quantity) {
			if(menuPrices.containsKey(dish)) {
				order.put(dish, order.getOrDefault(dish, 0)+quantity);
			}
		}
		public int calculateTotal() {
			int total=0;
			for(String dish : order.keySet()) {
				total += order.get(dish)* menuPrices.get(dish);
			}
			return total;
		}
		
		public void setComplete(boolean isComplete) {
			this.isComplete=isComplete;
		}
		public boolean isComplete() {
			return isComplete;
		}

		
}
