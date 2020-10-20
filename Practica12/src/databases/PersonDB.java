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
}
