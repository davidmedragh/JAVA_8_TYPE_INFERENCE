/**
 * 
 */
package com.dmedragh.tutorial;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dmedragh Class tutorial to introduce JAVA8 inference type enhancement
 *
 */
public class InferenceSampleClass {

	/**
	 * 
	 */
	public InferenceSampleClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> maListe = new ArrayList<>();
		List<Object> empList = Collections.emptyList();

		// This do not work in java7 as there os now way to assign a list of String to a
		// list of Object
		maListe = Collections.emptyList();

		Method[] lesMethodes = Personne.class.getMethods();
		for (Method method : lesMethodes) {
			System.out.println("Le nom de la methode ==>" + method.getName());
			System.out.println("Le type retourné par la methode ==>" + method.getReturnType());
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("Nom du parametre ==>" + parameter.getName());
				System.out.println("Type du parametre ==>" + parameter.getType());
			}
		}

	}

}
