package domain;

import javax.persistence.*;


@Embeddable
public class Adres {
	
	//private long id;
	private String street;
	private Integer houseNumber;
	private String city;
	private PostalCode postalCode;
	

	public Adres() {}
	
	public Adres(String street, Integer houseNumber, String city, PostalCode postalCode) {
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.postalCode = postalCode;
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

	@Embedded
	public PostalCode getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "Adres [street=" + street + ", houseNumber=" + houseNumber + ", city=" + city + ", postalCode="
				+ postalCode + "]";
	}



	//@Embeddable
	public static class PostalCode {
		
		private int numbers;
		private String letters;
		
		
		public PostalCode() {}
		
		
		public int getNumbers() {
			return numbers;
		}
		
		public void setNumbers(int numbers) {
			this.numbers = numbers;
		}
	
		public String getLetters() {
			return letters;
		}
		public void setLetters(String letters) {
			this.letters = letters;
		}

		@Override
		public String toString() {
			return "PostalCode [numbers=" + numbers + ", letters=" + letters + "]";
		}
		
		
	}
	
	

}
