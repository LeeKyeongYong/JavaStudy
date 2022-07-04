package com.study.giaischool009;
/*
 Exam044
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		 * 배열의 인덱스의 수만큼 별을 출력해보세요 
		 *  3: ***
		 *  4: ****
		 *  4: ****
		 *  2: **
		 *  1: *
		 *  
		   정답: 
		 */
		
		int [] startcount= {3,4,4,2,1};
		for(int i=0; i<=startcount.length-1; i++) {

			System.out.print(startcount[i]+" : ");
			for(int j=1; j<=startcount[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
