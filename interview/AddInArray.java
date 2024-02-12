package interview;

import java.util.ArrayList;

public class AddInArray {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(12);
		arrayList.add(22);
		arrayList2.add(3);
		arrayList2.add(18);
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		
	     for(int i=0;i<arrayList.size();i++) {
	    	if(i<arrayList2.size()) {
	    		int sum=arrayList.get(i)+arrayList2.get(i);
	    		 arrayList3.add(sum);
	    	}else {
	    		int sum=arrayList.get(i)+0;
	    		 arrayList3.add(sum);
	    	}
	    	 
	    			 
	    	
	    	 
	     }
	     System.out.println(arrayList);
	     System.out.println(arrayList2);
	     System.out.println(arrayList3);
	}

}
