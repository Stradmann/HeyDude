
public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private Insurance insurance;
	
	
	public Person (String name) {
		
		this.name = name;
	}
	
	public Person (String name, int age, double height, double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;		
	}
	
	public void printPerson() {
		
		System.out.println(this.name + ", Age: " + this.age);
	}
	
	public void printPerson(int year, int month, int day) {
		
		Date date = new Date(year, month, day);
		if (this.insurance.isValid(date)) {
			System.out.println(this.name + ", Age: " + this.age + ", Insurance valid till: " + this.insurance.getEndDate());
		}else {
			System.out.println(this.name + ", Age: " + this.age + ", Insurance expired or not created.");
		}
	}
	
	public void contractInsurance (int year, int month, int day) {
		
		this.insurance = new Insurance(this, year, month, day);
	}
	
	public void becomeOlder() {
		
		this.age ++;
	}
	
	public void becomeOlder(int years) {
		
		this.age += years;
	}
	
	public boolean isAdult() {
		
		if(this.age < 18) {
			return false;
		}else {
			return true;
		}
	}
	
	public double bodyMassIndex() {
		
		double heightDivPerHundred = height/100;
		return weight / (heightDivPerHundred * heightDivPerHundred);
	}
	
	
	//TO STRING
	
	@Override
	public String toString() {
		
		return "Name: " + this.name + ", Age: " + this.age + ", MassIndex: " + bodyMassIndex();
	}
	
	//GETTERS AND SETTERS
	
	public String getName() {
		
		return this.name;
	}
	
	public void setName(String newName) {
		
		this.name = newName;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public void setAge(int newAge) {
		
		this.age = newAge;
	}
	
	public double getHeight() {
		
		return this.height;
	}
	
	public void setHeight(double newHeigth) {
		
		this.height = newHeigth;
	}
	
	public double getWeight() {
		
		return this.weight;
	}
	
	public void setWeight(double newWeight) {
		
		this.weight = newWeight;
	}
}
