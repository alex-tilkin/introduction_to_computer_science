package practice_8;

public class Politician {
	private String name;
	private int yearOfBirth;
	private int id;
	
	public Politician(String name, int yearOfBirth, int id) {
		setName(name);
		setYearOfBirth(yearOfBirth);
		setId(id);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	private void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
}