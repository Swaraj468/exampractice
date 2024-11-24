package pojo;

import java.util.ArrayList;

public class practicepojo {
	private String id;
	private Namepracticepojo Name;
	private address address;
	private ArrayList<Integer> phone;
	
 
	public practicepojo(String id, String FirstName,String LastName, String State, Integer HouseNo,
			String StreetName, Integer Pincode) {
		this.id = id;
		this.Name = new Namepracticepojo(FirstName, LastName);
		this.address = new address(State, HouseNo, StreetName, Pincode);
		this.phone = new ArrayList<Integer>();
		
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Namepracticepojo getName() {
		return Name;
	}

	public void setName(Namepracticepojo name) {
		Name = name;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}
	
	public void setMobile(int...a) {
		for(int i=0; i<a.length; i++) {
			this.phone.add(a[i]);
		}
	}
	
}
