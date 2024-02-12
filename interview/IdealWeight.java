package interview;

public class IdealWeight {
	public static int idealWeight(int current,int required) {
		int month=0;
		while(current<required) {
			month++;
			current=current+month;
			
		}
		return month;
	}
	public static void main(String[] args) {
		int idealWeight = idealWeight(60,70);
		System.out.println(idealWeight);
	}

}
