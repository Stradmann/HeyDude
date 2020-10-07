
public class JavaObjects {
	
	public static void main(String[] args) {
		
		Person James = new Person ("James", 23, 182.0, 80.0);
		System.out.println(James);
		
		James.contractInsurance(2020, 10, 6);
		James.becomeOlder();
		James.printPerson(2021, 6, 23);
	}
}
