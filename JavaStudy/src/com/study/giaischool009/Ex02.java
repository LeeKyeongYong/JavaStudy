package com.study.giaischool009;
import java.util.Scanner;

/*
 Exam045
 */
public class Ex02 {
	public static void main(String[] args) {
		/*
		String change[]={"수","박"};
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("====수박 게임 start!====");
		System.out.print("숫자를 입력해주세요>>");
		num=sc.nextInt();
		String str="";
		int booChange=num%2;
		int count=0;
		for(int i=0;i<num; i++) {
		    System.out.print(change[i%2]);
		}
		
		System.out.println();
		답안
		 */
		Scanner sc=new Scanner(System.in);
		char[] ft= {'수','박'};
		System.out.println("===수박 게임 start!====");
		System.out.print("숫자를 입력해주세요: ");
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			if(i%2==0) {
				System.out.print(ft[0]);
			} else {
				System.out.print(ft[1]);
			}
			//System.out.print(ft[i%2]);
		}
	}
}
