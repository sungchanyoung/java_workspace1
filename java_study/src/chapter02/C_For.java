package chapter02;

import java.util.Iterator;
import java.util.Scanner;

public class C_For {
  public static void main(String[] args) {
	  //반복문 :어떤 작업을 반복적으로 실행하고 싶을떄 사용
	  // 종류: for문 ,while, do~while문 
      // 특정 조건이 만족될 떄 까지 코드 블록을 반복 실행 
	  // 횟수가 정해져 있을때 
	  // for(초기화; 조건식; 증감식;){조건이 만족될때 까지 실행할 코드}
	  for(int i =1; i<5; i++) {
		  System.out.println(i);
	  }
	  System.out.println();
	  // 반복문을 사용하여 짝수만 출력 
	  
	  for(int i =1; i<=10; i++) {
		  if(i%2 ==0)System.out.print(i+" ");
	  }
	  System.out.println();
	  // for문을 사용하여 구구단의 일부를 출력하는 코드 
	  for(int i =2 ; i <10; i++) {// 2단,3단 
		  for(int j =1; j<10; j++) {// 2*1,2*2...이런 순으로 증가 
			  System.out.println(i+" * "+j+" = "+ i*j );
		  }
		  System.out.println();
	  }
  }
}
