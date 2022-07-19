package comn.sutdy.stringShape;

public class SolutionShape_hasyadesu {
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	public static boolean solution(int x) {
		int sum=0;
		while(x!=0) {
			sum+=x%10;
			x/=10;
		}
		return x%sum==0?true:false;
	}
}
