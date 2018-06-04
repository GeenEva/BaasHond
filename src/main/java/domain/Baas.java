package domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "baas")
public class Baas {
	
	
	private long id;
	private String name;
	private List<Dog> dogs = new ArrayList<>();
	private Adres adres;
	
	public Baas() {}

	@Id
	@Column(name = "baas_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "baas_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "baas")
	public List<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}
	
	@Embedded
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Baas [id=" + id + ", name=" + name + ", dogs=" + dogs + ", adres=" + adres + "]";
	}

	
	
	
}