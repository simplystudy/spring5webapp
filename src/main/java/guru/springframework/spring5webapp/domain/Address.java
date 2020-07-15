package guru.springframework.spring5webapp.domain;

public class Address {

	private String line;
	private String city;
	private String state;
	private int zip;
	
	public Address(String line, String city, String state, int zip) {
		super();
		this.line = line;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
}
