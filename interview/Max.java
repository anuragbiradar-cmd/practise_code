package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Max {

		public static HashMap<String, Integer> maxChar(String s1,String s2) {
			int count=0;
			int max=0;
			HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						count++;
					}
				}
				hashMap.put(s2, count);
				count=0;
//				Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
//				for(Entry<String, Integer> en:entrySet) {
//					Integer value = en.getValue();
//					if(value>max) {
//						max=value;
//					}
					
//				}
	
			}
		return hashMap;
		}
		public static void main(String[] args) {
			String []arr= {"preeti","khusbhu","katherina"};
			String s1="vikas";
			for(int i=0;i<arr.length;i++) {
				HashMap<String, Integer> maxChar = maxChar(s1, arr[i]);
				Set<Entry<String, Integer>> entrySet = maxChar.entrySet();
				System.out.println(maxChar);
			}
		}

}
