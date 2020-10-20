package modules;

import Utilities.StringUtilities;
import Utilities.RandomUtilities;

public class Person {

	private String firstName;
	private String lastName;
	private Date birthday;
	
	private String username;
	private String password;
	
	//CONSTRUCTOR
	public Person (String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.username = StringUtilities.getThreeFirstChar(firstName) + StringUtilities.getThreeFirstChar(lastName);
		this.password = this.getUsername() + RandomUtilities.getSecretNumber();
	}
	
	//GETTERS & SETTERS
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public void setBirthday(Date birthday) {
		
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		
		return this.birthday;
	}
	
	public String getUsername() {
		
		return this.username;
	}
	
	public String getPassword() {
		
		return this.password;
	}
}