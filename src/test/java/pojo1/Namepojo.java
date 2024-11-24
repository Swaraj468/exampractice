package pojo1;

public class Namepojo {
	private String FirstName;
	private String LastName;
	
	public Namepojo(String FirstName, String LastName) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
