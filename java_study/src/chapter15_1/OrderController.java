package chapter15_1;
import chapter15_1.*;
public class OrderController {
	private OrderModel model;
	private OrderView view;
	
	public OrderController(OrderModel model,OrderView view) {
		this.model  = model;
		this.view =view;
	}
	public void processOrder() {
		while(!model.isComplete()) {
			String userChoice = view.gerUserChoice();
			switch(userChoice) {
			case "1" :
				model.addOrder("Pizza", view.getQuantity());
				break;
			case "2" :
				model.addOrder("Pasta", view.getQuantity());
				break;
			case "3" :
				model.addOrder("Coke", view.getQuantity());
				break;
			case "4" :
				model.addOrder("ADE", view.getQuantity());
				break;
			case "quit" :
				model.setComplete(true);
				view.displayTotalPrice(model.calculateTotal());
				view.displayOrderComplete();
				break;
			default: 
				System.out.println("Invaild Choice ,Please try again");
			}
		}
	}
}
