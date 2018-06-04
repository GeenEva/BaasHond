package domain;

import javax.persistence.*;


@Embeddable
public class Adres {
	
	//private long id;
	private String street;
	private Integer houseNumber;
	private String city;
	
	
	public Adres() {}
	
	public Adres(String street, Integer houseNumber, String city) {
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
	}


	


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	@Column(nullable = true)
	public Integer getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return ", street=" + street + ", houseNumber=" + houseNumber + ", city=" + city + "]";
	}
	
	
}
