package JATTASK6;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Manoj", 28);
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());
	}
}
