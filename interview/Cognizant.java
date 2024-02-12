package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cognizant {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(11,18,20,24,85,66,13);
		List<Integer> collect = asList.stream().filter(i->i/10==1).collect(Collectors.toList());
	    System.out.println(collect);	
	}

}
