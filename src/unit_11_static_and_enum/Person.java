package unit_11_static_and_enum;

public class Person {
	public static final int ADULT_AGE = 18;
	private static int minAgeForlicense = 18;
	private static int globalId = 0;
	private String name;
	private int age;
	private int id;

	public Person(String name, int age) {
		this.setName(name);
		this.age = age;
		id = globalId;
		
		globalId++;
	}
	
	public static int getMinAgeForlicense() {
		return minAgeForlicense;
	}

	public static void setMinAgeForlicense(int minAgeForlicense) {
		Person.minAgeForlicense = minAgeForlicense;
	}
	
	public boolean isLegalForDriving() {
		return age >= minAgeForlicense;
	}

	public String getName() {
		return name;
	}
	
	public static int getNumberOfPeople() {
		return globalId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", ID: " + id;
	}
}