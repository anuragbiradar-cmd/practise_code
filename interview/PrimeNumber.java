package interview;

public class PrimeNumber {
	public static void prime(int num) {
		int i=2;
		if(num<2) {
		System.out.println("inappropriate number");
		}else {
		while(i<num) {
			if(i==2) {
				System.out.println(i+" "+"prime number");
				i++;
			}else {
				if(i%2==0) {
					i++;
				}else {
					System.out.println(i+" "+"prime number");
					i++;
				}
			}
			
		}
		}
	}
	public static void main(String[] args) {
		prime(2);
	}

}
