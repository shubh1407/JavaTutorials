package javatutorials.beans;

public class Address {

	private int houseNo;
	private String city;
	private String country;

	public Address(int houseNo, String city, String country) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.country = country;
	}
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return " houseNo=" + houseNo + ", city=" + city + ", country=" + country;
	}
	
	
}
