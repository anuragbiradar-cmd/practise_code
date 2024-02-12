package interview;

import java.util.HashMap;
import java.util.Map;

public class CountinElements {
	public static void main(String[] args) {
		String s="abcgabfazlmopb";
		int count=1;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i!=j) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
			}
			hashMap.put(s.charAt(i), count);
			count=1;
		}
		System.out.println(hashMap);
	}

}
