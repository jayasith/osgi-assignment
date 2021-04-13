package vehiclepayment;

import java.util.Scanner;

public class VehiclePayementImpl implements VehiclePaymentService{
	
	double totalPrice;
	double vehiclePrice;
	
	public void getPaymentMethod(String type, int days, String vehicleNo, int noOfVehicles){
	
		System.out.println("Enter Vehicle Type: " + type);
		System.out.println("Enter number of Days Type: " + days);
		System.out.println("Enter Vehicle No: " + vehicleNo);
		System.out.println("Enter Number of Vehicles: " + noOfVehicles);
	if(type == "1") {
		vehiclePrice = 1000;
	}
	else if(type == "2"){
		vehiclePrice = 1200;
	}
	else if(type == "3"){
		vehiclePrice = 1300;
	}
	
	
	totalPrice =  noOfVehicles*(vehiclePrice*days);	
	
	} 
	
	public void calculation() {
		System.out.println("Adavance of the rent : Rs."+ totalPrice);
	}
	
	public void getCard() {
		Scanner sc = new Scanner(System.in);
		boolean isContinue= true;
		do {
			
		System.out.println("Enter your Bank Details");

		System.out.println("VISA or Master card : ");
		String card = sc.nextLine();
		
		if(card.equalsIgnoreCase("visa")||card.equalsIgnoreCase("master")) {
			isContinue = false;
		}
		else {
			System.out.println("Re-Enter the Bank card type");
			
		}
		
		}while(isContinue);
			
		
		System.out.println("Card Number");
		String cardNo = sc.nextLine();
		System.out.println("Card Name");
		String cardName = sc.nextLine();
		System.out.println("Expire Date");
		String exDate = sc.nextLine();
		
		System.out.println("Your payment Rs." + totalPrice +" is successfully completed.");
		
	
		
		
		
	}
}