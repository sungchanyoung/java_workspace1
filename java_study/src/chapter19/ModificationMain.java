package chapter19;

public class ModificationMain {
	public static void main(String[] args) {
		//익명 클래스 사용하여 
		Modification<String> m1 =new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) {
				System.out.println("기존의 데이터"+ oldData);
				System.out.println("새로운 데이터"+ newData);
				return newData+"1" ;
			}
		}; 
		Modification<String> m2 =new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) {
				System.out.println("기존의 데이터"+ oldData);
				System.out.println("새로운 데이터"+ newData);
				return newData+"2" ;
			}
		}; 
		Modification<String> m3 = (oldData,newData) -> newData+"3";
		
		String name  = "이승아";
		String newName = m1.modify(name, "이도경");
		System.out.println(newName);
		String newName2 = m2.modify(name, "김명진");
		System.out.println(newName2);
		String newName3 = m3.modify(name, "이지희");
		System.out.println(newName3);

	}
}
