package chapter02;

public class D_While {
 public static void main(String[] args) {
	 // while문 일반적으로 반복횟수가 지정되지 않을때  사용
	 // 조건을 검사하고 해당 조건이 true인경우 코드 블록을 실행 
	 // if문의 반복 형태 
	 /*
	  *while (조건){따로 증감식으로 넣어줘야한다 
	  *	조건이 참 일떄 실행
	  *}
	  */
	 int num =1; 
	 while(num <=5) {
		 System.out.println(num);
		 num++;
	 }
	 //cf)while문 내부에서 코드블룩의 계속적 실행 :continue문 
	 //while문의코드블록 중단 break;
	 int number=0;
	 while(true) {
		 if(number %2 ==0) {
			 number++;
			 continue; // 루프안에서 continue를 만나면 아래의 코드를 무시하고 다시조건을 실행 
		 }
		 System.out.println(number);
		 number++;
		 if(number ==20) break;
		 
	 }

 }
}
