package chapter14.view;

import java.util.Scanner;

public class OrderView {
	// 사용자로 부터 주문을 받는 로직 
	private Scanner sc = new Scanner(System.in);
	public String getUserChoice() {
		System.out.println("============");
		System.out.println("select an option");
		System.out.println("pizza");
		System.out.println("pasta");
		System.out.println("Coke");
		System.out.println("Ade");
		System.out.println("your Choice: ");
		return sc.nextLine();
		}
	// 주문 수량을 사용자에게 요청하는 메서드 
	public int getQuantity() {
		System.out.println("Enter Quantity");
		return sc.nextInt();
	}
	public void displayTotalPrice(int price) {
		System.out.println("Total Price : "+ price+ "KRW");
	}
	public void displayOrderComplete() {
		System.out.println("Order has been completed");
	}
}
