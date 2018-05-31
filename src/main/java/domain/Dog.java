package domain;

import javax.persistence.*;

@Entity
@Table(name = "dog")
public class Dog {

	private long id;
	
	private String name;
	private Baas baas;
	
	
	@OneToOne(mappedBy = "dog")
	public Baas getBaas() {
		return baas;
	}

	public void setBaas(Baas baas) {
		this.baas = baas;
	}

	public Dog() {}

	public Dog(String name) {
		this.name = name;
	}
	
	
	@Id
	@Column(name= "dog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	
}