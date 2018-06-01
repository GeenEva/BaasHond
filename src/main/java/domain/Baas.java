package domain;

import java.util.*;
import java.io.*;

import javax.persistence.*;

@Entity
@Table(name = "baas")
public class Baas {
	
	private long id;
	private String name;
	private List<Dog> dogs = new ArrayList<>();
	
//CONSTRUCTORS
	
	public Baas() {}
	
	public Baas(String name) {
		this.name = name;
	}
	
	public Baas(String name, List<Dog> dog) {
		this.name = name;
		dogs = dog;
	}

// GETTERS / SETTERS
	
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

	
	@OneToMany(fetch=FetchType.EAGER) 
	@JoinColumn(name = "baas_id")
	public List<Dog> getDogs() {
		return dogs;
	}
	
	
	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;

	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
	}

	
	@Override
	public String toString() {
		return "Baas [id=" + id + ", name=" + name + ", dogs=" + dogs + "]";
	}
}