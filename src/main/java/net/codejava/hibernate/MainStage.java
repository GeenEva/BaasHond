package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.*;
import domain.Adres.PostalCode;

import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
	/*	GenericDAO genDAO3 = new GenericDAO();
		Dog dog = new Dog();
		dog.setId(3);
		Dog dog3 = (Dog) genDAO3.readObject(dog.getClass(), dog.getId());
	
		System.out.println(dog3.toString());
	*/	
		
		PostalCode postalCode = new Adres.PostalCode();
		postalCode.setNumbers(5349);
		postalCode.setLetters("AP");
		Adres adres = new Adres("straadt", 34, "stadt", postalCode);
	//	adres.setPostalCode(postalCode);
		System.out.println(adres.toString());
		
		Baas baas = new Baas("Frans", adres);
		
		GenericDAO genDAO = new GenericDAO();
		genDAO.createObject(baas);
		genDAO.closeEntityManager();
	}
	
	
}
