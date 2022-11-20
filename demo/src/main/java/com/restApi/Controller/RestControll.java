package com.restApi.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.model.Person;

@RestController
public class RestControll {
	
	Person p = new Person(2,"mash","12");
	
	
	@RequestMapping("/")
	public String home() {
		return "home page";
	}
	
	
	@RequestMapping("/getperson")
	public Person getPerson() {
		
		return p;
	}
	
	@GetMapping("/findperson/{pid}")
	public Person findPerson(@PathVariable int pid) {
//		System.out.print(people());
		for(Object person :people()) {
			
			if(((Person)person).getPid()==pid) {
				return (Person) person;
			}
			
			
			System.out.println(person);
		}
		return p;

	}
	
	
	@GetMapping("getbynamex")
	public Person getbynamex(@RequestParam String name) {
		
		if(name == "tany") {
			System.out.println("match");
		}
		
		for(Object person:people()) {
			if(((Person) person).getName().equals(name)) {
				System.out.println("entered");
				return (Person) person;
				
			}
			System.out.println(person);
			System.out.println("name is "+name);
		}
		
		return p;
		
	}
	
	@GetMapping("/getdata")
	public Person getData(@RequestParam String name, @RequestParam String age) {
		return people().stream().filter((person)->person.getAge().equals(age) && person.getName().equals(name) ).findAny().orElse(new Person());
		
		
	}
	
	@RequestMapping("/people")
	private List<Person> people(){
		return Arrays.asList(
				new Person(2,"arun","12"),
				new Person(3,"tany","18"),
				new Person(4,"naatha","21"),
				new Person(5,"manguu","18"),
				new Person(6,"swasthik","21")
				);
		
	}
	
	
	
	

	
	
	

}
