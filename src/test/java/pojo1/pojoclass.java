package pojo1;

import java.util.ArrayList;

public class pojoclass {
	private String id;
	private Namepojo Name;
	private ArrayList<Integer> phone;
	private Addresspojo Address;
	private Universitypojo UniversityInformation;
	
	
	
	public pojoclass(String id, String FirstName, String LastName, 
			String Country, String State, String StreetName,
			Integer HouseNo, Integer Pincode, String UniversityName
			,String Degree, String Section, String Course, String CollegeAddress) {
		this.id = id;
		this.Name = new Namepojo(FirstName, LastName);
		this.Address = new Addresspojo(Country, State, StreetName, HouseNo, Pincode);
		this.UniversityInformation = new Universitypojo(UniversityName, Degree, Section, Course, CollegeAddress);
		this.phone = new ArrayList<Integer>();
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Namepojo getName() {
		return Name;
	}


	public void setName(Namepojo name) {
		Name = name;
	}


	public Addresspojo getAddress() {
		return Address;
	}


	public void setAddress(Addresspojo address) {
		Address = address;
	}


	public Universitypojo getUniversityInformation() {
		return UniversityInformation;
	}


	public void setUniversityInformation(Universitypojo universityInformation) {
		UniversityInformation = universityInformation;
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
