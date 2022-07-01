package com.study.giaischool008;

public class Ex05_report {
	public static void main(String[] args) {
		int[] arr= {3,4,4,2,1};
		/*
		 * 배열의 인덱스의 수만큼 별을 출력해보세요 
		 *  3: ***
		 *  4: ****
		 *  4: ****
		 *  2: **
		 *  1: *
		 *  https://kkh0977.tistory.com/category/Java
		 */
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+":");
			for(int j=0;j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
