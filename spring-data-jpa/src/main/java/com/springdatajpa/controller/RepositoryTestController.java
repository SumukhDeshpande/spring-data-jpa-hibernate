package com.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.entity.Person;
import com.springdatajpa.entity.Student;
import com.springdatajpa.repositories.PersonRepository;
import com.springdatajpa.repositories.StudentRepository;

@RestController
public class RepositoryTestController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/testMapping")
	public String testMapping() {
		return "Returned a Successful Test Response.";
	}
	
	@GetMapping("/person/{id}")
	public Person findPerson(@PathVariable int id) {
		return personRepository.findPerson(Person.class, id);
	}
	
	@PostMapping("/person/save")
	public String savePerson(@RequestBody Person person) {
		personRepository.savePerson(person);
		return "Saved Person successfully";
	}
	
	@GetMapping("/persons")
	public List<Person> findAllPersons(){
		return personRepository.findAllPersons();
	}
	
	@PostMapping("/person/update")
	public String updatePerson(@RequestBody Person person) {
		personRepository.updatePerson(person);
		return "Updated Person successfully.";
	}
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable Long id){
		return studentRepository.findById(id);
	}

}
