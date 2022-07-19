package comn.sutdy.stringShape;

public class CrossShape {
	public static void main(String[] args) {
		int size=5;
		int alphaH=65;
		int alphaV=65;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i==size/2) {
					System.out.print((char)(alphaH+j));
				} else {
					if(j==size/2) {
						System.out.print((char)(alphaV+i));
					} else {
						System.out.print(" ");
					}
				}
				
				
			}
			if(i==size/2) {
				alphaV++;
			}
			//alphaV++; 안하면 abcde abcde가 된다.
			System.out.println();
		}
	}
}
