package com.study.giaischool009;

import java.util.Scanner;

/*
 Exam045 
 */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===채점하기===");
		System.out.println("답을 입력하세요.");
		int[] input=new int[5];
		
		/*
		for(int i=0; i<input.length; i++) {
			
			System.out.print((i+1)+"번답 >> ");
			input[i]=sc.nextInt();
		}
		System.out.print("입력한답: ");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		답안
		*/
		//정답이 있는 배열
		int[] answer= {1,4,3,2,1};
		int sum=0;//총점을 저장할 변수
		String oxChange[]=new String[5];
		for(int i=0; i<input.length; i++) {
			System.out.print((i+1)+"번답 >> ");
			input[i]=sc.nextInt();
		}
		
		System.out.print("입력한답: ");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		for(int i=0; i<input.length; i++) {
			//값 비교
			if(input[i]==answer[i]) {
				sum+=20;
				oxChange[i]="o";
			} else {
				oxChange[i]="x";
			}
		}
		
		System.out.println("정답확인 ");
		for(int i=0; i<input.length; i++) {
			System.out.print(oxChange[i]+" ");
		}
		System.out.println(" 총점은: "+sum);
		sc.close();
	}
}
