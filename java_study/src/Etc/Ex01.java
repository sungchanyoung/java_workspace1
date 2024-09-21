package Etc;
//싱글톤 : 설계 패턴중 하나 
// 클래스의 인스턴스가 하나만 생성되도록 보장 
// 
public class Ex01 {
	private static Ex01 instance;
	private Ex01() {};
	public static Ex01 getInstance() {
		if(instance == null) {
			 instance = new Ex01();
		}
		return instance;
	}
}
