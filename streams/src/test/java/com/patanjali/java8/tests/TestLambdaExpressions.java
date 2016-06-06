package com.patanjali.java8.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.patanjali.java8.model.Person;

public class TestLambdaExpressions {
	private List<Person> getPersonList() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("sachin tendulkar",29));
		persons.add(new Person("rahul dravid",30));
		persons.add(new Person("yuvaraj singh",34));
		persons.add(new Person("ms dhoni",35));
		persons.add(new Person("virat kohli",28));
		return persons;
	}
	@Test
	public void testLambda() {
		List<Person> persons = getPersonList();
		//old java style
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		for(Person person:persons) {
			System.out.println(person.toString());
		}
		
		//using lambda expressiopns
		Collections.sort(persons, (p1, p2) -> 
				p1.getName().compareTo(p2.getName()));
		for(Person person:persons) {
			System.out.println(person.toString());
		}
	}
}
