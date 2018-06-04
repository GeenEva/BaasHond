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
		baasje.setName("RobertoFermicello");	
		
		hond.setBaas(baasje);
		hond2.setBaas(baasje);
	
		List<Dog> hondjes = new ArrayList<>();
		hondjes.add(hond);
		hondjes.add(hond2);
		
		
		baasje.setDogs(hondjes);
		
		Adres adres = new Adres("typo", 232, "nunu");

		
		baasje.setAdres(adres);
		System.out.println(baasje.toString());
		
	//	GenericDAO genDAO3 = new GenericDAO();
	//	genDAO3.createObject(adres);
		
		
		GenericDAO genDAO2 = new GenericDAO();
		genDAO2.createObject(baasje);
		
		Dog hodje = new Dog();
		hodje.setName("Hodje");
		hodje.setBaas(baasje);
		
		genDAO2.createObject(hodje);
		genDAO2.closeEntityManager();
		
	
	}
	
	
}
