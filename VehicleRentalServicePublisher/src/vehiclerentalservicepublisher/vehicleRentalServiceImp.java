package vehiclerentalservicepublisher;

import java.util.Scanner;

import org.osgi.framework.BundleContext;
import vehiclerentalservicepublisher.VehicleRentalActivator;

public class vehicleRentalServiceImp implements vehicleRentalService {

	
	public void vehicle() {
		
		Scanner scanner = new Scanner(System.in);
		String vehicleType;
		String days;
		String fullName;
		String mobileNo;
		String Address;
		String noOfvehicles;
		String date;
		boolean confirm = true ;
		
		System.out.println("Welcome");
		
		//VehicleRentalActivator.paymentservice.print();
		
		do {
			System.out.println("what vehicle type you choese? (just type a no) \n 1.Car \n 2.Van \n 4.Bus \n 3.Truck");
			vehicleType = scanner.nextLine();
			
		}while(vehicleType =="1" ||vehicleType=="2" ||vehicleType=="3" ||vehicleType=="4");
		
			switch(vehicleType) {
			case "1":
				System.out.println("Car details \n \t 3 members \n \t 10KG extra weight");
				break;
			case "2":
				System.out.println("Van details\n \t 10 members \n \t 10KG extra weight");
				break;
			case "3":
				System.out.println("Truk details\n \t 1 members \n \t 1500KG extra weight");
				break;
			case "4":
				System.out.println("Bus details \n \t 60 members \n \t 500KG extra weight");
				break;
			default:
				System.out.println("invalid input, pleas type again");
			}
		
					
		
		System.out.println("How many vehicle do you need?");
		noOfvehicles = scanner.nextLine();
		
		switch(vehicleType) {
		case "1":
			System.out.println("Price details");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t DAYS \t MAX KMs \t    PRICE ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t  1 \t  120 \t   Rp:10000 + Rp:500 per 1km(exceed) \n\t 2 \t 200 \t   Rp:20000 + Rp:500 per 1km(exceed)"
					+ "\n\t 3 \t 320 \t   Rp:30000 + Rp:500 per 1km(exceed) \n\t 4 \t 450 \t   Rp:40000 + Rp:500 per 1km(exceed)"
					+ "\n\t 5 \t 320 \t   Rp:50000 + Rp:500 per 1km(exceed)");
			break;
		case "2":
			System.out.println("Price details");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t DAYS \t MAX KMs \t    PRICE ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t  1 \t  120 \t   Rp:15000 + Rp:500 per 1km(exceed) \n\t  2 \t  200 \t   Rp:30000 + Rp:500 per 1km(exceed)"
					+ "\n\t  3 \t  320 \t   Rp:45000 + Rp:500 per 1km(exceed) \n\t  4 \t  450 \t   Rp:60000 + Rp:500 per 1km(exceed)"
					+ "\n\t  5 \t  320 \t   Rp:75000 + Rp:500 per 1km(exceed)");
			break;
		case "3":
			System.out.println("Price details");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t DAYS \t MAX KMs \t    PRICE ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t  1 \t  120 \t   Rp:20000 + Rp:500 per 1km(exceed) \n\t  2 \t  200 \t   Rp:30000 + Rp:500 per 1km(exceed)"
					+ "\n\t  3 \t  320 \t   Rp:40000 + Rp:500 per 1km(exceed) \n\t  4 \t  450 \t   Rp:50000 + Rp:500 per 1km(exceed)"
					+ "\n\t  5 \t  320 \t   Rp:60000 + Rp:500 per 1km(exceed)");
			break;
		case "4":
			System.out.println("Price details");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t DAYS \t MAX KMs \t    PRICE ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\t  1 \t  120 \t   Rp:20000 + Rp:500 per 1km(exceed) \n\t  2 \t  200 \t   Rp:35000 + Rp:500 per 1km(exceed)"
					+ "\n\t  3 \t  320 \t   Rp:50000 + Rp:500 per 1km(exceed) \n\t  4 \t  450 \t   Rp:65000 + Rp:500 per 1km(exceed)"
					+ "\n\t  5 \t  320 \t   Rp:80000 + Rp:500 per 1km(exceed)");				
			break;
		default:
			System.out.println("\ninvalid input, pleas type again");
		}
		
	do {
			System.out.println("Number of days?");
			days = scanner.nextLine();
							
			
		}while(confirm);
		
		System.out.println("what is start daty of the trip?");
		date = scanner.nextLine();
		System.out.println("Enter your full name");
		fullName = scanner.nextLine();
		System.out.println("Enter your mobilr number?");
		mobileNo = scanner.nextLine();
		System.out.println("Enter your address?");
		Address = scanner.nextLine();
		
		
	}
	


}
