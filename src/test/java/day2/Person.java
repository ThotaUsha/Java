package day2;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	public Person()
	{
		
	}
	public Person(String firstName,String lastName,char gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public char getgender() {
		return gender;
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	
	/*public void display() {
		System.out.println("Person Details:");
		System.out.println("First Name : "+ firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Gender :"+ gender);
	}*/
}
