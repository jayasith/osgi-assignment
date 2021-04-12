package vehiclerentalservice;

import java.util.Scanner;

import org.osgi.framework.BundleContext;

import vehiclerentalservice.VehicleRentalActivator;

public class vehicleRentalServiceImp implements vehicleRentalService {
	
	String vehicleType;
	int days;
	String fullName;
	String mobileNo;
	String Address;
	int noOfvehicles;
	String date;
	boolean avability = false ;
	boolean confirm = false ;
	boolean input = false ;
	
		public void vehicle() {
			
			
			
			Scanner scanner = new Scanner(System.in);
			
			//VehicleRentalActivator.paymentservice.print();
			
			do {
				
				System.out.println("what vehicle type you choese? (just type a no) \n 1.Car \n 2.Van \n 3.Bus");
				vehicleType = scanner.nextLine();
				input = false;
			
				switch(vehicleType) {
				case "1":
					System.out.println("Car details \n \t 3 members \n \t 10KG extra weight");
					break;
				case "2":
					System.out.println("Van details\n \t 10 members \n \t 10KG extra weight");
					break;
				case "3":
					System.out.println("Bus details \n \t 60 members \n \t 500KG extra weight");
					break;
				default:
					System.out.println(" Invalid input, Pleas type again");
					input = true;
				}
			
			}while(input);		
			
			System.out.println("\nHow many vehicle do you need?");
			noOfvehicles = scanner.nextInt();
			
			switch(vehicleType) {
			case "1":
				System.out.println("Price details");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t DAYS \t MAX KMs \t     PRICE ");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t  1 \t  120 \t   Rs:10000 + Rs:500 per 1km(exceed) \n\t  2 \t  200 \t   Rs:20000 + Rs:500 per 1km(exceed)"
						+ "\n\t  3 \t  320 \t   Rs:30000 + Rs:500 per 1km(exceed) \n\t  4 \t  450 \t   Rs:40000 + Rs:500 per 1km(exceed)"
						+ "\n\t  5 \t  320 \t   Rs:50000 + Rs:500 per 1km(exceed)");
				break;
			case "2":
				System.out.println("Price details");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t DAYS \t MAX KMs \t     PRICE ");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t  1 \t  120 \t   Rs:15000 + Rp:500 per 1km(exceed) \n\t  2 \t  200 \t   Rs:30000 + Rs:500 per 1km(exceed)"
						+ "\n\t  3 \t  320 \t   Rs:45000 + Rs:500 per 1km(exceed) \n\t  4 \t  450 \t   Rs:60000 + Rs:500 per 1km(exceed)"
						+ "\n\t  5 \t  320 \t   Rs:75000 + Rs:500 per 1km(exceed)");
				break;
			case "3":
				System.out.println("Price details");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t DAYS \t MAX KMs \t     PRICE ");
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("\t  1 \t  120 \t   Rs:20000 + Rp:500 per 1km(exceed) \n\t  2 \t  200 \t   Rs:30000 + Rs:500 per 1km(exceed)"
						+ "\n\t  3 \t  320 \t   Rs:40000 + Rs:500 per 1km(exceed) \n\t  4 \t  450 \t   Rs:50000 + Rs:500 per 1km(exceed)"
						+ "\n\t  5 \t  320 \t   Rs:60000 + Rs:500 per 1km(exceed)");
				break;
			default:
				System.out.println("\ninvalid input, pleas type again");
			}
			
			do {
				System.out.println("\nNumber of days?");
				days = scanner.nextInt();
								
				
			}while(avability);
			
			System.out.println("what is start daty of the trip?");
			date = scanner.nextLine();
			System.out.println("Enter your full name");
			fullName = scanner.nextLine();
			System.out.println("Enter your mobile number?");
			mobileNo = scanner.nextLine();
			System.out.println("Enter your address?");
			Address = scanner.nextLine();
		
			do {
				
								
				
			}while(confirm);
			
		}
		
	
	

}
