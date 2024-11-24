package gmeet;

import java.util.ArrayList;

public class pojo {
	private String id;
	private namepojo Name;
	private address Address;
	private ArrayList<Integer> phone;
	
	public pojo(String id, String FirstName, String LastName, String Country,
			String State, String HouseNo, String StreetName, Integer Pincode) {
		this.id = id;
		this.Name = new namepojo(FirstName, LastName);
		this.Address = new address(Country, State, HouseNo, StreetName, Pincode);
		this.phone = new ArrayList<Integer>();
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public namepojo getName() {
		return Name;
	}

	public void setName(namepojo name) {
		Name = name;
	}

	public address getAddress() {
		return Address;
	}

	public void setAddress(address address) {
		Address = address;
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
