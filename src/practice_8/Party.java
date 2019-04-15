package practice_8;

public class Party {
	final int MAX_NUMBER_OF_MEMBERS = 120;
	private String name;
	private String policy;
	private Politician[] members;
	private int actualSize;
	public Party(String name, String policy) {
		setName(name);
		setPolicy(policy);
		members = new Politician[MAX_NUMBER_OF_MEMBERS];
		actualSize = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public Politician[] getMembers() {
		return members;
	}

	public void addMember(Politician newPolitician) {
		members[actualSize] = newPolitician;
		actualSize++;
	}
}