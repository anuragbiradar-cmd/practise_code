package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prin {
	public static void main(String[] args) {
//		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
//		hashMap.put("a", 1);
//		hashMap.put("d", 4);
//		hashMap.put("b", 2);
//		hashMap.put("c", 3);
//		
//		LinkedHashMap<String, Integer> collect = hashMap.entrySet().stream().sorted((e1,e2)->{
//			return e1.getValue()-e2.getValue();
//		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
//		System.out.println(collect);
		
		String s="anagram is the word";
		String s1="";
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			count++;
		     if(s.charAt(i)==' '|| i==0) {
		    	 int j=i;
		    	 while(count>0) {
		    		 --count;
		    		 if(i==0) {
		    			 s1=s1+' '+s.charAt(j);
			    		 j++;
		    		 }
		    		 s1+=s.charAt(j);
		    		 j++;
		    	 }
		     }
		}
		System.out.println(s1);
			
		
	}

}
