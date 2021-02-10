package codingPractiseTest;
class Employee{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1=new Employee("Virat", "Kholi");
		Employee e2=new Employee("Rahul", "Dravid");
		Employee e3=new Employee("Rohit", "Sharama");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}