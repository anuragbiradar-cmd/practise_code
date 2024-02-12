package interview;

public class SumEvenOdd {
	public static int  addition(int[] arr) {
	int	evenSl=Integer.MIN_VALUE;
	int evenmax=Integer.MIN_VALUE;
	int oddmax=Integer.MIN_VALUE;
	int oddsl=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			if(arr[i]>evenmax) {
				evenSl=evenmax;
				evenmax=arr[i];
			}else if(arr[i]>evenSl) {
				evenSl=arr[i];
			}
		
		
		
		
		}else {
			if(arr[i]>oddmax) {
				oddsl=oddmax;
				oddmax=arr[i];
				
			}else if(arr[i]>oddsl) {
				oddsl=arr[i];
			}
		}
		
	}
	return evenSl+oddsl;
	
	}
	public static void main(String[] args) {
		int []arr= {3,2,1,7,5,4};
		int addition = addition(arr);
		System.out.println(addition);
	}

}
