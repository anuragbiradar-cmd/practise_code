package interview;

public class WaveArray {
	public static void main(String[] args) {
	int []arr= {2,4,7,8,9,10};
	int i=0;
	int j=i+1;
	int temp=0;
	while(j<=arr.length-1) {
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		i+=2;
		j+=2;
	}
	for(int a:arr) {
		System.out.println(a);
	}
	}

}
