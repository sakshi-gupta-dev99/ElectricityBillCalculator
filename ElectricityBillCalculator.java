import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID:");
        int id = sc.nextInt();
    
        if(id < 0) {
            System.out.println("Invalid Customer ID: ");
            sc.close();
            return;
        }

        sc.nextLine();

        System.out.print("Enter Customer Name:");
        String name = sc.nextLine();

        if(name.trim().isEmpty()) {
            System.out.println("Invalid Name! Name cannot be empty.");
            sc.close();
            return;
        }
         
        System.out.print("Enter the Electricity units(Consumed units):");
        int units = sc.nextInt();

        double Bill_Amount = 0;

        if(units < 0) {
            System.out.println("Invalid input ! units cannot be negative.");
            sc.close();
            return;
        }

        double slab1 = 0, slab2 = 0, slab3 = 0;
        double slab4 = 0, slab5 = 0, slab6 = 0;

        if(units > 0) 
            slab1 = Math.min(units, 100)*2;
        
        if(units > 100) 
            slab2 = Math.min(units - 100, 100) * 3; 

        if(units > 200) 
            slab3 = Math.min(units - 200, 100) * 4; 

        if(units > 300) 
            slab4 = Math.min(units - 300, 100) * 5; 

        if(units > 400) 
            slab5 = Math.min(units - 400, 200) * 6;

        if(units > 600) 
            slab6 = (units - 600) * 7;  

        Bill_Amount = slab1 + slab2 + slab3 + 
                      slab4 + slab5 + slab6;

        double fixedCharge = 50;

        double subTotal = Bill_Amount + fixedCharge;

        double tax = subTotal * 5 / 100;

        double finalBill = subTotal + tax;

        System.out.println("\n=========================================");
        System.out.println("\n---------ELECTRICITY BILL-------");
        System.out.println("\n=========================================");

        System.out.println("ID                : " + id);
        System.out.println("Name              : " + name);
        System.out.println("Units Consumed    : " + units);

        System.out.println("-------------------------------------------");
        System.out.println("               BILL BREAKDOWN              ");
        System.out.println("-------------------------------------------");

        System.out.println("Slab 1 Charge     : " + slab1);
        System.out.println("Slab 2 Charge     : " +  slab2);
        System.out.println("Slab 3 Charge     : " + slab3);
        System.out.println("Slab 4 Charge     : " + slab4);
        System.out.println("Slab 5 Charge     : " + slab5);
        System.out.println("Slab 6 Charge     : " + slab6);

        System.out.println("------------------------------------------");
        System.out.printf("Electricity Charge : Rs. %.2f%n", Bill_Amount);
        System.out.printf("Fixed Charge       : Rs. %.2f%n", fixedCharge);
        System.out.printf("Subtotal           : Rs. %.2f%n", subTotal);
        System.out.printf("Tax (5%%)          : Rs. %.2f%n", tax);

        System.out.println("==========================================");
        System.out.printf("Final Bill         : Rs. %.2f%n", + finalBill);
        System.out.println("==========================================");

        sc.close();
    }
}