package com.springdatajpa.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdatajpa.entity.Person;

@Repository
@Transactional
public class PersonRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Person findPerson(Class<Person> person, int id) {
		return entityManager.find(person, id);
	}

	public void savePerson(Person p) {
		entityManager.merge(p);
	}
	
	public List<Person> findAllPersons(){
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
	
	public void updatePerson(Person person) {
		//We have to find the person first as the entity is in detached state.
		Person personToUpdate = findPerson(Person.class, person.getId());
		personToUpdate.setBirthDate(person.getBirthDate());
		personToUpdate.setLocation(person.getLocation());
		personToUpdate.setName(person.getName());
		entityManager.persist(personToUpdate);
	}
}
