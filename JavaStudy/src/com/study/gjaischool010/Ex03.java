package com.study.gjaischool010;
/*
 Exam050
 */
public class Ex03 {
	public static void main(String[] args) { //비정방형 배열
		/*
		 비정방형 배열
		 	각 행의 열의 갯수가 다른 배열 비정방형 배열의 생성
		 */
		int[][] array=new int[3][];
		
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[3];
		
		int cnt=10;
		array[0][0]=cnt;
		array[1][0]=cnt*2;
		array[1][1]=cnt*3;
		
		array[2][0]=cnt*4;
		array[2][1]=cnt*5;
		array[2][2]=cnt*6;
		
		
		System.out.print(array[0][0]);
		System.out.println();
		
		System.out.print(array[1][0]+" ");
		System.out.print(array[1][0]);
		System.out.println();
		

		System.out.print(array[2][0]+" ");
		System.out.print(array[2][1]+" ");
		System.out.print(array[2][2]);
		System.out.println();
		
		System.out.println();
		
		/*
		 반복문을 사용하게 된다면... 
		 */
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j]=cnt;
				cnt+=10;
				
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	}
}
