package interview;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpIml {
	public static void main(String[] args) {
		Employee employee = new Employee(1, 25, "male", "ramesh", 25000);
		Employee employee1 = new Employee(2, 27, "female", "rashmi", 25000);
		Employee employee2 = new Employee(3, 28, "female", "bhakti", 25000);
		Employee employee3 = new Employee(4, 26, "male", "arush", 25000);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
//		Map<String, Long> collect = arrayList.stream().filter(i->i.getGender().equals("female")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
		
	 List<Employee> collect = arrayList.stream().filter(i->i.getAge()<27).map(e-> {
		e.setSalary(e.getSalary()*1.10);
		return e;
	 }).collect(Collectors.toList());
		
		System.out.println(collect);
		
		}

}
