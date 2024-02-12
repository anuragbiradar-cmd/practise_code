package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.add("amir");
//		arrayList.add("sagar");
//		arrayList.add("bhushan");
//		List<String> collect = arrayList.stream().filter(i->i.charAt(0)=='a').collect(Collectors.toList());
//		collect.stream().forEach(System.out::print);
		int []arr= {1,2,3,4,5};
//		int lst=arr.length-1;
//		for(int i=0;i<arr.length/2;i++) {
//			int temp=arr[lst];
//			arr[lst]=arr[i];
//			arr[i]=temp;
//			lst--;
//		}
//		
//		for(Integer a:arr) {
//			System.out.println(a);
//		}
		
		
		//rotaions
		int ro=2;
		int pass=1;
		while(pass<=ro) {
		int temp=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		pass++;
		
		}		
		for(Integer a:arr) {
		System.out.println(a);
	}
	}

}
