package com.study.giaischool006;
import java.util.Scanner;

/*
Exam032

*/
public class Ex05 {
	public static void main(String[] args) {
		/*
		   for문예제 
		      정수를 입력받아 1부터 입력받은 정수까지 차례대로 출력하는 프로그램을 작성하시오
		 */
				Scanner sc=new Scanner(System.in);
				System.out.print("입력하세요: >>");
				int num=sc.nextInt();
				for(int i=1; i<=num; i++) {

					System.out.print("출력: "+i+" ");
					if(i%10==0) {
						System.out.println();
					}
				}
				sc.close();
	}
}
