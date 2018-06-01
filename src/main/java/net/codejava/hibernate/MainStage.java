package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.*;
import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
Dog doggie = new Dog("snakkie");
		
		Class c = doggie.getClass();
		GenericDAO<Dog> genDAO = new GenericDAO<Dog>(c);
		
	
		genDAO.createObject(doggie);
		genDAO = new GenericDAO<Dog>(c);
		doggie = genDAO.readObject(5);
		
		
		GenericDAO<Dog> genDAO2 = new GenericDAO<Dog>(c);
		Dog doggie2 = genDAO2.readObject(11);
		List<Dog> doggies = new ArrayList<Dog>();
		doggies.add(doggie);
		doggies.add(doggie2);
		
		
		
		Baas baas = new Baas("Joep", doggies);
		System.out.println(baas.toString());
	//	Class b = baas.getClass();
		GenericDAO <Baas> genDAObaas = new GenericDAO<Baas>();
		genDAObaas.createObject(baas);

	}
	
	
}
