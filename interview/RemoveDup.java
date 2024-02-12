package interview;

public class RemoveDup {
	public static int[] remove(int arr[]) {
		int []arr1=new int[arr.length];
		int position=0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				if(arr[i]==arr[i+1]) {
					continue;
				}else {
					arr1[position]=arr[i];
					position++;
				}
			}else {
				arr1[position]=arr[i];
				position++;
			}
		}
		return arr1;
		
	}
	public static void main(String[] args) {
		

		int []arr= {1,1,1,1,2,2,3};
		int[] remove = remove(arr);
		for(int a:remove) {
			System.out.println(a);
		}
		
		

	}

}
