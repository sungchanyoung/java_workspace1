package chapter15_1;
import java.util.*;
public class OrderView {
	private Scanner sc= new Scanner(System.in);
	public String gerUserChoice() {
		System.out.println("=============");
		System.out.println("Select an option");
		System.out.println("1.Pizza");
		System.out.println("2.Pasta");
		System.out.println("3.Coke");
		System.out.println("4.Ade");
		System.out.println("Your Choice");
		return sc.nextLine();
	}
	public int getQuantity() {
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		sc.nextLine();
		return quantity;
	}
	public void displayTotalPrice(int price) {
		System.out.println("Total Price : "+ price +"KRW");
	}
	public void displayOrderComplete() {
		System.out.println("Order has been completed");
	}
}
