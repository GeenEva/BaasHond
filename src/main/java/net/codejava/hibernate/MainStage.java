package net.codejava.hibernate;

import daoos.GenericDAO;
import domain.*;
import java.io.*;
import java.util.*;

import javax.persistence.*;

public class MainStage {
	public static void main(String[] args) {
		
		GenericDAO genDAO3 = new GenericDAO();
		Dog dog = new Dog();
		dog.setId(3);
		Dog dog3 = (Dog) genDAO3.readObject(dog.getClass(), dog.getId());
	
		System.out.println(dog3.toString());
		
	
	}
	
	
}
