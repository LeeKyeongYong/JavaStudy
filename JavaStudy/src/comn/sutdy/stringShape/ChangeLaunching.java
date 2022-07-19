package comn.sutdy.stringShape;

import java.util.Scanner;

public class ChangeLaunching {
	
	
	    public static void main (String[] args) {
	        System.out.println("Please enter a number");
	        Scanner New_Number = new Scanner(System.in);
	        int number = New_Number.nextInt();
	        DecimalToBinary(number);
	    }

		private static void DecimalToBinary(int number) {
			// TODO Auto-generated method stub
			int[] Binary_number=new int[100];
			
			int x=0;
			while(number>0) {
				Binary_number[x]=number%2;
				number /=2;
				x++;
			}
			
			for(int y=x-1; y>=0; y--) {
				System.out.print(Binary_number[y]+" ");
			}
		}
}
