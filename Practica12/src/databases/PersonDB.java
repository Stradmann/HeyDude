package databases;

import java.util.ArrayList;

import modules.Person;

public class PersonDB {

	private ArrayList<Person> uniUsers;
	
	public PersonDB () {
		
		uniUsers = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		
		uniUsers.add(person);
	}
	
	public Person findByUsername(String username) {
		
		for (Person person : uniUsers) {
			if (person.getUsername().equals(username)) {
				return person;
			}
		}
		return null;
	}
}
