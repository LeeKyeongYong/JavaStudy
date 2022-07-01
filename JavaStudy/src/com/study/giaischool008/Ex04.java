package com.study.giaischool008;
import java.util.Scanner;

/*
 Exam043
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array=new int[5];
		/*
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1)+"번째 입력 > ");
			array[i]=sc.nextInt();
		}
		System.out.print("입력된 수: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		답안: 
		*/
		for(int i=0; i<array.length;/*배열의 초기 부터 마지막까지*/ i++) {
			System.out.print((i+1)+" 번째 입력 >> ");
			array[i]=sc.nextInt();
		}
		System.out.print("입력된 점수: ");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		/*
		System.out.println(1+" 번째 입력 >> ");
		array[0]=sc.nextInt();
		
		System.out.println(2+" 번째 입력 >> ");
		array[1]=sc.nextInt();
		
		System.out.println(3+" 번째 입력 >> ");
		array[2]=sc.nextInt();
		
		System.out.println(4+" 번째 입력 >> ");
		array[3]=sc.nextInt();
		
		System.out.println(5+" 번째 입력 >> ");
		array[4]=sc.nextInt();
		
		
		System.out.print("입력된수: "+array[0]);
		*/
		sc.close();
	}
}
