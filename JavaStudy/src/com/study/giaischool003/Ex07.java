package com.study.giaischool003;
import java.util.Scanner;

/*
 * Exam17
 * 
 */
public class Ex07 {
	public static void main(String[] args) {
		/*
		  두개의 정수를 입력받아 큰수에서 작은수를 뺀 결과값을 출력하세요. 
		 */
			Scanner sc=new Scanner(System.in);
			
			System.out.print("첫번째 정수 입력: ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 정수 입력: ");
			int num2 = sc.nextInt();
			
			int result = ( num1 > num2 ) ? ( num1 -num2 ) : ( num2 -num1 );
			
			System.out.println("두수의 차: "+result);
			sc.close();
			
	}
}
