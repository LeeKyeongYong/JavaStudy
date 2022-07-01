package com.study.giaischool008;
import java.util.Scanner;

/*
 Exam044
 */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int jumsu[] = new int[5];
		int sum=0; //총합
		int averge=0; //평균
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print((i+1)+"번째 입력 >> ");
			jumsu[i]=sc.nextInt();
			
		}
		
		System.out.print("입력된 점수: ");

		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
			sum+=jumsu[i];
		}
		
		averge=sum/jumsu.length;
		

		int max=jumsu[0];//최대치
		
		for(int i=0; i<jumsu.length; i++) {
			
			if(jumsu[i]>max) {
				max=jumsu[i];
			}
		}
		

		int min=jumsu[0]; //최소치
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]<min) {
				min=jumsu[i];
			}
		}
		
		System.out.println();
		System.out.println("총합: "+sum);
		System.out.println("평균: "+averge);
		System.out.println("최고점수 "+max);
		System.out.println("최저점수 "+min);
		
		sc.close();
	}
}
