
import java.util.*;
public class UserInterface 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the flight ID:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter source:");
		String source = sc.nextLine();
		System.out.println("Enter destination:");
		String destination = sc.nextLine();
		System.out.println("Enter noOfSeats:");
		int seats=sc.nextInt();
		System.out.println("Enter Fare:");
		double fare = sc.nextDouble();
		
		Flight flight = new Flight(id, source, destination, seats, fare);

		FlightManagementSystem fms = new FlightManagementSystem();

		boolean result = fms.addFlight(flight);

		if(result)
		{
		    System.out.println("Flight details added successfully");
		}
		else
		{
		    System.out.println("Flight details not added successfully");
		}
		
	
		
	}

}
