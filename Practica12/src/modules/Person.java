package modules;

public class Person {

	private String firstName;
	private String lastName;
	private Date birthday;
	
	//CONSTRUCTOR
	public Person (String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
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
}
