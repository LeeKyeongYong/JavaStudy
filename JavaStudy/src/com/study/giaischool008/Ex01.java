package com.study.giaischool008;
import java.util.Scanner;

/*
Exam038

*/
public class Ex01 {
	public static void main(String[] args) {
		//돌아온 별찍기.
		/*
		    *
		   **
		  ***
		 ****
		*****
		*힌트, 어떠한 문자를 출력하면 반드시 위쪽부터 출력이 된다.
		*어떻게 별을 띄어서 출력을 했을까?
		*어라? 빈공간이 아닐까?
		*빈공간이 하나씩 줄어들고 있다.
		*첫번째줄
		*System.out.print(" ");
		*/
		for(int i=0; i<5; i++) {
			for(int k=5; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println();
		
		/*
		 답안 
		 */
		//첫번째줄 
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}for(int j=1; j<=1+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}