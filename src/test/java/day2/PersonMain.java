package day2;

public class PersonMain {
	public static void main(String args[]) {
		
		Person p = new Person("Divya","Bharathi",'F');
		
		System.out.println("Personal Details:");
		System.out.println("__________________");
		System.out.println("");
		System.out.println("First Name: " + p.getfirstName());
		System.out.println("Last Name: " + p.getlastName());
		System.out.println("Gender: "+ p.getgender());
	}

}
