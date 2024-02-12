package interview;

public class Factorial {
	public static int fact(int n) {
		while(n>0) {
			return n*fact(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		int fact = fact(5);
		System.out.println(fact);
	}

}
