package JATTASK6;

public class Employee {
	private int id, salary;
	private String firstName, lastName;

	public Employee(int id, String fName, String lName, int salary) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int p) {
		return salary += salary * p / 100;
	}

	public String toString() {
		return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee e = new Employee(878, "mula", "manoj kumar", 70000);
		System.out.println(e);
		e.raiseSalary(10);
		System.out.println("After raise: " + e);
		System.out.println("Annual Salary: " + e.getAnnualSalary());
	}
}