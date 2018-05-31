package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.Baas;
import domain.Dog;

public class MainStage {
	
//	private static final Class<?> Book = null;

	public static void main(String[] args) {
		
		GenericDAO genDAO = new GenericDAO();
		
		Dog doggie = new Dog("Fksie");
		genDAO = new GenericDAO<Dog>();
		genDAO.createObject(doggie);
		
		Baas baas = new Baas("Honkie", doggie);
		genDAO = new GenericDAO<Baas>();
		genDAO.updateObject(baas);
	}
	
	
}
