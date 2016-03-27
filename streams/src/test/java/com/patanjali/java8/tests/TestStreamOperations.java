package com.patanjali.java8.tests;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.patanjali.java8.model.Person;
import org.junit.Test;

public class TestStreamOperations {

	private static List<Person> persons =
		    Arrays.asList(
		            new Person("Max", 18),
		            new Person("Peter", 23),
		            new Person("Pamela", 23),
		            new Person("David", 12));
	@Test
	public void testCollectOperation() {
		List<Person> filtered =
			    persons
			        .stream()
			        .filter(p -> p.getName().startsWith("P"))
			        .collect(Collectors.toList());

			System.out.println(filtered);
	}
	
	@Test
	public void testCollectToSet() {
		Set<Person> set = persons.stream()
				.filter(s->s.getName().startsWith("P"))
				.collect(Collectors.toSet());
		System.out.println(set);
	}
}
