package com.study.giaischool004;
import java.util.Scanner;

/*
  Exam024 
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 1을 입력하면 안녕하세요.
		 2을 입력하면 반갑습니다.
		 3. 안녕히 가세요
		 4. 또오세요
		*/
		System.out.print("1~4번을 입력해주세요: ");
		int choice=sc.nextInt();
		if (choice == 1) {
			System.out.println("안녕하세요. ");
		} else if (choice == 2) {
			System.out.println("반갑습니다. ");
		} else if (choice == 3) {
			System.out.println("안녕히가세요. ");
		} else {
			System.out.println("또 오세요. ");
		}
	}
}
