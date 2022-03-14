
public class Address {
	
	private String flatNo;
	private String streeNo;
	private String landmark;
	private String city;
	private String pinCode;
	
	public Address() {
	}

	public Address(String flatNo, String streeNo, String landmark, String city, String pinCode) {
		this.flatNo = flatNo;
		this.streeNo = streeNo;
		this.landmark = landmark;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreeNo() {
		return streeNo;
	}

	public void setStreeNo(String streeNo) {
		this.streeNo = streeNo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
}
