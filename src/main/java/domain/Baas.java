package domain;

import javax.persistence.*;

@Entity
@Table(name = "baas")
public class Baas {
	
	private long id;
	private String name;
	
	@OneToOne(mappedBy="baas")
	private Dog dog;
	
	
	public Baas() {}
	
	public Baas(String name, Dog dog) {
		this.name = name;
		this.dog = dog;
	}
	
	
	@Id
	@Column(name= "baas_id")
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

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dog_id")	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
