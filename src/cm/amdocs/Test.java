package cm.amdocs;

public class Test {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static long factorial(int n){
		
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
}
