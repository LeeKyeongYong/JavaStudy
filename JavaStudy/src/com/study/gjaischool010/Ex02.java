package com.study.gjaischool010;
/*
 Exam049
 */
public class Ex02 {
	final static int num=5; //배열예제 강제 고정
	public static void main(String[] args) {
		/*
		  			Array를 다음과 같이 출력하시오
		  	  숫 자 진 행 방 향
		  	|	|	|	|	|		  	21	26	31	36	41
		  	|	|	|	|	|		  	22	27	32	37	42
		  	|	|	|	|	|		  	23	28	33	38	43
		  	|	|	|	|	|			24	29	34	39	44
		  	↓	↓	↓	↓	↓		  	25	30	35	40	45
		 */
		int cnt=21;
		int[][] array=new int[num][num];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j]=cnt;
				cnt++;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[j][i] +"\t");
			}
			System.out.println();
		}
		
	}
}
