package gmeet;

public class address {
	private String Country;
	private String State;
	private String HouseNo;
	private String StreetName;
	private Integer Pincode;
	
	public address(String Country, String State, String HouseNo, 
			String StreetName, Integer Pincode) {
		this.Country = Country;
		this.State = State;
		this.HouseNo = HouseNo;
		this.StreetName = StreetName;
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

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public Integer getPincode() {
		return Pincode;
	}

	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}
	

}
