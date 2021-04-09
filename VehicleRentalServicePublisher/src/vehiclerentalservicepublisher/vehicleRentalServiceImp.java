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
			
			System.out.println("Welcome");

			
			do {
				System.out.println("what vehicle type you choese? (just type a no) \n  1.Car \n 2.Van \n 3.Truck \n 4.Bus ");
				vehicleType = scanner.nextLine();
				switch(vehicleType) {
				case "1":
					System.out.println("Car details \n \t 3 members \n \t 10KG extra weight");
					System.out.println("Price details");
				case "2":
					System.out.println("Van details\n \t 10 members \n \t 10KG extra weight");
					System.out.println("Price details");
				case "3":
					System.out.println("Truk details\n \t 1 members \n \t 1500KG extra weight");
					System.out.println("Price details");
				case "4":
					System.out.println("Bus details \n \t 60 members \n \t 500KG extra weight");
					System.out.println("Price details");
				default:
					System.out.println("invalid input, pleas type again");
				}
			}while(vehicleType!="1" ||vehicleType!="2" ||vehicleType!="3" ||vehicleType!="4");
			
			System.out.println("How many vehicle do you need?");
			noOfvehicles = scanner.nextLine();
			
			
			System.out.println("Number of days?");
			days = scanner.nextLine();
			
			System.out.println("what is start daty of the trip?");
			date = scanner.nextLine();
			System.out.println("Enter your full name");
			fullName = scanner.nextLine();
			System.out.println("Enter your mobilr number?");
			mobileNo = scanner.nextLine();
			System.out.println("Enter your address?");
			Address = scanner.nextLine();
			
			
		}
		
		public String vehicleAvalability() {
			
			
			return null;
			
		}
		
	

}
