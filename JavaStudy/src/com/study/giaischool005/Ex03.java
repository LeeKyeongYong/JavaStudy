package com.study.giaischool005;
/*
  Exam028
 */
public class Ex03 {
	public static void main(String[] args) {
		//while문을 사용하여 3부터 97까지 출력하시요
		int num=3;
	    while (num<=97) {
			System.out.print(num+" ");
			
			//길어서 줄임...
			if(num%15==0) {
				System.out.println();
			}
	    	num++;
		}
	}
}
//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