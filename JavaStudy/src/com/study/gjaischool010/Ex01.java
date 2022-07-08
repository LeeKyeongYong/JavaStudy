package com.study.gjaischool010;
/*
 Exam048
 */
public class Ex01 {
	public static void main(String[] args) {

		int[][] array=new int[3][3];
		/*
		//0행
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		
		//1행
		array[1][0]=4;
		array[1][1]=5;
		array[1][2]=6;
		
		//2행
		array[2][0]=7;
		array[2][1]=8;
		array[2][2]=9;
		
		//2차원 배열: 배열안에 배열이 있다.
		System.out.println(array[0]);
		
		//0행출력
		System.out.print(array[0][0]+" ");//1
		System.out.print(array[0][1]+" ");//2
		System.out.print(array[0][2]+" ");//3
		System.out.println();
		
		//1행출력
		System.out.print(array[1][0]+" ");//4
		System.out.print(array[1][1]+" ");//5
		System.out.print(array[1][2]+" ");//6
		System.out.println();
		
		//2행출력
		System.out.print(array[2][0]+" ");//7
		System.out.print(array[2][1]+" ");//8
		System.out.print(array[2][2]+" ");//9
		System.out.println();
		
		int cnt=0;
		
		//0행출력
		cnt++;
		array[0][0]=cnt;
		System.out.print(array[0][0]+" ");//1
		
		cnt++;
		array[0][1]=cnt;
		System.out.print(array[0][1]+" ");//2
		
		cnt++;
		array[0][2]=cnt;
		System.out.print(array[0][2]+" ");//3
		System.out.println();
		
		//1행 
		cnt++;
		array[1][0]=cnt;
		System.out.print(array[1][0]+" ");//1
		
		cnt++;
		array[1][1]=cnt;
		System.out.print(array[1][1]+" ");//2
		
		cnt++;
		array[1][2]=cnt;
		System.out.print(array[1][2]+" ");//3
		System.out.println();
		
		
		//2행
		cnt++;
		array[2][0]=cnt;
		System.out.print(array[2][0]+" ");//1
		
		cnt++;
		array[2][1]=cnt;
		System.out.print(array[2][1]+" ");//2
		
		cnt++;
		array[2][2]=cnt;
		System.out.print(array[2][2]+" ");//3
		System.out.println();
		*/
		
		int cnt=1;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j]=cnt;
				cnt++;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
