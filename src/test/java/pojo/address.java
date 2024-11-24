package pojo;

public class address {
	
	private String State;
	private Integer HouseNo;
	private String StreetName;
	private Integer Pincode;
	
	public address(String State ,Integer HouseNo, String StreetName, Integer Pincode) {
		this.State = State;
		this.HouseNo = HouseNo;
		this.StreetName = StreetName;
		this.Pincode = Pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(Integer houseNo) {
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
