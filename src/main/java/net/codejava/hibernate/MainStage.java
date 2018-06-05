package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.*;
import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
		Dog hond = new Dog();
		hond.setName("dut");
		Dog hond2 = new Dog();
		hond2.setName("mop");
		
		Baas baasje = new Baas();
		baasje.setName("JustRoberto");	
		
		hond.setBaas(baasje);
		hond2.setBaas(baasje);
	
		List<Dog> hondjes = new ArrayList<>();
		hondjes.add(hond);
		hondjes.add(hond2);
		
		baasje.setDogs(hondjes);
		
		Adres adres = new Adres("strposfi9asss", 43832, "serieus");
		Adres.PostalCode postalCode = new Adres.PostalCode();
		postalCode.setLetters("as");
		postalCode.setNumbers(6348);
		System.out.println(postalCode.toString());
		
		
		adres.setPostalCode(postalCode);
		System.out.println(adres.toString());
		baasje.setAdres(adres);
			
		System.out.println(baasje.toString());
		
		
		GenericDAO genDAO2 = new GenericDAO();
		genDAO2.createObject(baasje);
		/*		
		Dog hodje = new Dog();
		hodje.setName("Hodje");
		hodje.setBaas(baasje);
		
		genDAO2.createObject(hodje);
		
		
		
		genDAO2.closeEntityManager();
	*/	
	
	}
	
	
}
