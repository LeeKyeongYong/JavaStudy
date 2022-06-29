package com.study.giaischool006;
import java.util.Iterator;

/*
Exam032

*/
public class Ex06 {
	public static void main(String[] args) {
		int sum=0,sum2=0;
		for (int i=1; i<=100; i++) {
		//for (int i=1; i<=100; i+=3) {	
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합은 "+sum+" 입니다");
		
		for (int i=(1*3); i<=100; i+=3) {
					sum2+=i;
		 }
		   System.out.println("3의 배수의 합은 "+sum2+" 입니다");
	}
}
