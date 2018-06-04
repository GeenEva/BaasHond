package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.*;
import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
		Dog hond = new Dog();
		hond.setName("Yy");
		Dog hond2 = new Dog();
		hond2.setName("Zz");	
		
		Baas baasje = new Baas();
		baasje.setName("Sandra");	
		
		hond.setBaas(baasje);
		hond2.setBaas(baasje);
	
		List<Dog> hondjes = new ArrayList<>();
		hondjes.add(hond);
		hondjes.add(hond2);
		
		baasje.setDogs(hondjes);
		
		GenericDAO genDAO2 = new GenericDAO<>();
		genDAO2.createObject(baasje);
		genDAO2.closeEntityFactory();
		
	
	}
	
	
}
