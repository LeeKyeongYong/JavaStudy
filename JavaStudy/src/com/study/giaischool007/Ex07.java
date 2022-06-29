package com.study.giaischool007;
/*
Exam037

*/
public class Ex07 {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//거꾸로
		for(int i=5; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//답안
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
