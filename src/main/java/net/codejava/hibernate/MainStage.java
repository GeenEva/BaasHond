package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.Baas;
import domain.Dog;
import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("BaasHond");
	 		EntityManager entityManager = emFactory.createEntityManager();
	 		Dog doggie = new Dog("snakkie");
	 		entityManager.getTransaction().begin();
	 		entityManager.persist(doggie);
	 		
	 		Dog doggie2 = new Dog("flurby");
	 		entityManager.persist(doggie2);
	 		
	 		Baas baas = new Baas("Corrie");
	 		baas.addDog(doggie);
	 		baas.addDog(doggie2);
	 		
	 		entityManager.persist(baas);
	 		entityManager.getTransaction().commit();
			emFactory.close();
	
/*

	public static void main(String[] args) {

		Dog doggie = new Dog("snakkie");
		
		Class c = doggie.getClass();
		GenericDAO<Dog> genDAO = new GenericDAO<Dog>(c);
		
	
		genDAO.createObject(doggie);
		genDAO = new GenericDAO<Dog>(c);
		doggie = genDAO.readObject(5);
		
		List<Dog> doggies = new ArrayList<Dog>();
		doggies.add(doggie);
		
		
		
		Baas baas = new Baas("Joep", doggies);
		System.out.println(baas.toString());
	//	Class b = baas.getClass();
		GenericDAO <Baas> genDAObaas = new GenericDAO<Baas>();
		genDAObaas.createObject(baas);
	*/	
	}
	
	
}
