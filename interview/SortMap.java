package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMap {
	public static void main(String[] args) {
		HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
		Employee employee = new Employee(1, 25, "male", "ramesh", 25000);
		Employee employee1 = new Employee(2, 27, "female", "rashmi", 25000);
		Employee employee2 = new Employee(3, 28, "female", "bhakti", 25000);
		Employee employee3 = new Employee(4, 26, "male", "arush", 25000);
		hashMap.put("a", employee);
		hashMap.put("b", employee1);
		hashMap.put("c", employee2);
		hashMap.put("d", employee3);
//		 LinkedHashMap<String, Integer> collect = hashMap.entrySet().stream().sorted((e1,e2)->{
//			return e1.getValue()-e2.getValue();
//		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
//		System.out.println(collect);
		
//	 LinkedHashMap<String, Employee> collect = hashMap.entrySet().stream().sorted((e1,e2)->{
//		 return e1.getValue().name.compareTo(e2.getValue().name);
//	 }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
//	 
//	 System.out.println(collect);
		
		LinkedHashMap<String, Employee> collect = hashMap.entrySet().stream().sorted((e1,e2)->{
			return e1.getValue().age-e2.getValue().age;
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(collect);
	}

}
