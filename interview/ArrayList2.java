package interview;

import java.util.Arrays;

public class ArrayList2 {
	Object []arr=new Object[10];
	int position=0;
	
	public void add(Object value) {
		if(position<arr.length) {
			arr[position]=value;
			position++;
		}else {
			Object[] increaseCapacity = increaseCapacity();
			arr=increaseCapacity;
			arr[position]=value;
			position++;
			
			}
		}
	public Object[] increaseCapacity() {
		Object []arr1=new Object[arr.length+10];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
	
	public void remove(Object item) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==item) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
			}
			
		}
	}
	@Override
	public String toString() {
		return "ArrayList2 [arr=" + Arrays.toString(arr) + "]";
	}

	
	
	


}
