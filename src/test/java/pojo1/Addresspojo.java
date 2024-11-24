package pojo1;

public class Addresspojo {
	private String Country;
	private String State;
	private String StreetName;
	private Integer HouseNo;
	private Integer Pincode;
	
	public Addresspojo(String Country, String State, String StreetName, Integer HouseNo, Integer Pincode) {
		this.Country = Country;
		this.State = State;
		this.StreetName = StreetName;
		this.HouseNo = HouseNo;
		this.Pincode = Pincode;
		
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public Integer getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(Integer houseNo) {
		HouseNo = houseNo;
	}

	public Integer getPincode() {
		return Pincode;
	}

	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}
	

}
