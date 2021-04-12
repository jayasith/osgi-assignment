package vehiclerentalpublisher;

import java.util.Scanner;
import vehiclerentalpublisher.Activator;

public class rentalMainServiceImp implements rentalMainService {
	
	String serviceType;
	
	public void mainservice() {
		
		System.out.println("Welcom to car rental ");
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nwhat service you need(just type no)? \n 1 Buy a ride  \n 2 Rent your vehicle ");		
			serviceType = scanner.nextLine();
			
			switch(serviceType) {
				case "1":
					Activator.vehiclerentalservice.vehicle();
					break;
				case "2":
					
					break;
				default:
					System.out.println(" Invalid input, Pleas type again");
			}
			
		}while(serviceType != "1" || serviceType != "2" );
		
	}

}
