package day10;

public class MainPerson2 {
	
	public static void main(String[] args)
		{
			try
			{
				Person2 p2 = new Person2("Divya" ,"Bharathi" , "Female" ,20);
				p2.display();
			}
			catch(InvalidNameException e)
			{
				System.out.println("Error:"+e.getMessage());
			}
		}
	}

