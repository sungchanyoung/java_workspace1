package chapter02;

import java.util.Scanner;

public class E_Partice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun =true;
		System.out.println("프로그램 시작 ");
		while(isRun) {
			System.out.println("[회원 조회]");
			System.out.println("[1 회원 ]");
			System.out.println("[2 회원 조회]");
			System.out.println("[3 회원 탈퇴]");
			System.out.println("[q 프로그램 탈퇴]");
			
			System.out.println("메뉴 선택 ");
			// nextLine(); = 개행문자 까지 처리  
			String selectedMenu =  sc.nextLine();
			switch(selectedMenu) {
			case "1":
				System.out.println("회원 등록 가능합니다 ");
				break;
			case "2":
				System.out.println("회원 이름으로 조회합니다");
				break;
			case "3":
				System.out.println("회원 탈퇴 기능입니다 ");
				break;
			case "q":
				System.out.println("프로그램 종료 합니다 ");
				break;
			default:
				System.out.println("잘못된 입력입니다 ");
				break;	
		}
			
	}
		sc.close();
		System.out.println("프로그램 종료 ");

   }
}