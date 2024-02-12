package interview;

public class SingleNumber {
	public static void main(String[] args) {
		
	int count=1;
	int[]arr= {3,2,3,1,1,3,2};
	System.out.println(arr.length);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i!=j) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		if(count==1) {
			System.out.print(arr[i]);
		}else {
			count=1;
		}
	}
	
	}
}
