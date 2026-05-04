package day10;

public class MainPerson3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Person3 p3 = new Person3("Divya", "Bharathi", 10);

		System.out.println("Person created successfully");
		}

	catch(InvalidAgeException e)
	{
		System.out.println("Error:" +e.getMessage());
	}

}

}
