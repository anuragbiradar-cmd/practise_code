package interview;

public class Employee {
	int id;
	int age;
	String gender;
	String name;
	double salary;
	
	public Employee(int id, int age, String gender, String name, double salary) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", gender=" + gender + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
	

}
