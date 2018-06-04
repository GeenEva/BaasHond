package domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "dog")
public class Dog {

	private long id;
	private String name;
	private Baas baas;
	
	public Dog() {}
	
	@Id
	@Column(name = "dog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "dog_name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	@JoinColumn(name = "baas_id", nullable = true)
	public Baas getBaas() {
		return baas;
	}

	public void setBaas(Baas baas) {
		this.baas = baas;
	}
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
}
