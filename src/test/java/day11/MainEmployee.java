package day11;

public class MainEmployee {
	public static void main(String[] args) {

        try {
            Employee e = new Employee(105, "Ram", 2800);
            e.display();
        } 
        catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
