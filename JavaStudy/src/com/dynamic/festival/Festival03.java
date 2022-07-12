package com.dynamic.festival;
import java.util.Random;
/*
자바 패스티벌 3번문제
				8칸 크기의배열을 선언하고 랜덤수로 초기화 한 후가장 큰 수와 작은 수를 각각 출력하시오. (랜덤의 범위 1~99)
		< 결과화면 >
			배열에 있는 모든값: 10 56 21 55 35 54 14 26
			가장 큰값: 456
			가장 작은값: 400
*/
public class Festival03 {
	public static void main(String[] args) {
			int intArray[]=new int[8];
			Random rnd=new Random();
			for(int i=0; i<intArray.length; i++) {
				intArray[i]=rnd.nextInt(99)+1;
			}
			System.out.print("배열에 있는 모든값: ");
			int max=intArray[0];
			int min=intArray[0];
			for(int i=0; i<intArray.length; i++) {
				System.out.print(intArray[i]+" ");
				if(max<intArray[i]) {
					max=intArray[i];
				}
				if(min>intArray[i]) {
					min=intArray[i];
				}
				
			}
			System.out.println();
			System.out.println("가장 큰값: "+max);
			System.out.println("가장 작은 값: "+min);
	}
}
