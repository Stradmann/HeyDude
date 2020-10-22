package modules;

import Utilities.StringUtilities;
import menu.Profile;

import java.util.Scanner;

import Utilities.RandomUtilities;

public abstract class Person {

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
	
	//METHODS
	public void editProfile(Scanner read, Person user) {
		
		Profile.profileMenu(read, user);
	}
	
	public void printProfile() {
		
		System.out.println("Name: " + this.getFirstName() + ", Last Name: " + this.getLastName() + ", Birthday: " + this.getBirthday() + ", Username: " + this.getUsername() + ", Password: " + this.getPassword());
	}
	
	//GETTERS & SETTERS
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public void setFirstName(String name) {
		
		this.firstName = name;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public void setLastName(String last) {
		
		this.lastName = last;
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
	
	public void setUsername(String username) {
		
		this.username = username;
	}
	
	public String getPassword() {
		
		return this.password;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
}
