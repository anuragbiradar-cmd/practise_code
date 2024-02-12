package interview;

public class BinarySearch {
	public static int Bin(int []arr,int key) {
		int high;
		int low;
		int mid=arr.length/2;
		if(key==mid) {
			return mid;
			
		}
		if(key>arr[mid]) {
			low=mid;
			high=arr.length;
			for(int i=low;i<high;i++) {
				if(arr[i]==key) {
					return i;
				}
			}
			
		}
		if(key<arr[mid]) {
			low=0;
			high=mid;
			for(int i=low;i<high;i++) {
				if(arr[i]==key){
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,4,7,9,11};
		int bin = Bin(arr, 11);
		System.out.println(bin);
		
	}

}
