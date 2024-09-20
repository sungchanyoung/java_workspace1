package chapter20Library2.model;



public class User {
	private String name;
	private String userId;
	
	// 생성자
	public User(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public String getUserId() {
		return userId;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}