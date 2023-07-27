package Zaid;

import java.util.Scanner;

public class FoodOrderingSystem {

    static int choice;
    static int item;
    static int sum = 0;
    static String anotherItem;
    static String backToMainMenu;
    static Scanner sc = new Scanner (System.in);
    static String orders = "";

    public static void main(String[] args) {
        
        Start();

        do {
            Menu();
        } while(backToMainMenu.equals("yes"));
        
        Bill();
    }


    public static void Menu() {
        System.out.println("Enter '1' for Starters.\nEnter '2' for Main Course.\nEnter '3' for Deserts.\nEnter '4' for Drinks.\n");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                Starters();
                break;

            case 2:
                MainCourse();
                break;

            case 3:
                Deserts();
                break;

            case 4:
                Drinks();
                break;
            
            default:
                break;
        }


    }

    public static void Starters() {
        do {

            System.out.println("Enter '1' for Chicken Crispy                170.00\nEnter '2' for Veg Manchurian Dry                125.00\nEnter '3' for Chicken Chilly(Dry)               135.00\nEnter '4' for Chicken Lolly Pop             120.00\nEnter '5' for Chicken Manchow Soup				160.00\nEnter '6' for Sweet Corn Veg.Soup				150.00\n");
            item = sc.nextInt();
            
            switch (item) {
                case 1:
                sum = sum + 170;
                orders += "Chicken Crispy				170.00\n";
                break;
                
                case 2: 
                sum = sum + 125;
                orders += "Veg Manchurian Dry				125\n";
                break;
                
                case 3:
                sum = sum + 135;
                orders += "Chicken Chilly(Dry)				135.00\n";
                break;
                
                case 4:
                sum = sum + 120;
                orders += "Chicken Lolly Pop				120.00\n";
                break;
                
                case 5:
                    sum = sum + 160;
                    orders += "Chicken Manchow Soup				160.00\n";
                    break;
                    
                case 6:
                    sum = sum + 150;
                    orders += "Sweet Corn Veg.Soup				150.00\n";
                    break;
                    
                default:
                System.out.println("");
                
            }
            
            System.out.println("Do you like to add another item from starters? \nType 'yes' or 'no'");
            anotherItem = sc.next();
            
            
        } while (anotherItem.equals("yes"));
        
        System.out.println("Do you want to go back to Main Menu? Type 'yes' or 'no' .");
        backToMainMenu = sc.next();
        
        
    }


    public static void MainCourse() {
        do {

            System.out.println("Enter '1' for Chicken Tikka Biryani                150.00\nEnter '2' for Chicken Pulao                140.00\nEnter '3' for Paneer Kholapuri(Spicy)               150.00\nEnter '4' for Veg Pulao             110.00\nEnter '5' for Chicken Hakka Noodles               160.00\nEnter '6' for Butter Chicken                130.00\nEnter '7' for Chicken Angara                150.00\n");
            item = sc.nextInt();
            
            
            
            switch (item) {
                case 1:
                sum = sum + 150;
                orders += "Chicken Tikka Biryani				150.00\n";
                break;
                
                case 2: 
                sum = sum + 140;
                orders += "Chicken Pulao				140.00\n";
                break;
                
                case 3:
                sum = sum + 150;
                orders += "Paneer Kholapuri(Spicy)				150.00\n";
                break;
                
                case 4:
                sum = sum + 110;
                orders += "Veg Pulao				110.00\n";
                break;

                case 5:
                    sum = sum + 160;
                    orders += "Chicken Hakka Noodles				160.00\n";
                    break;

                case 6:
                    sum = sum + 130;
                    orders += "Butter Chicken				130.00\n";
                    break;

                case 7:
                    sum = sum + 150;
                    orders += "Chicken Angara				150.00\n";
                    break;
                
                default:
                System.out.println("");
                
            }
            
            System.out.println("Do you like to add another item from Main Course? \nType 'yes' or 'no'.");
            anotherItem = sc.next();
           
        } while (anotherItem.equals("yes"));
        
        System.out.println("Do you want to go back to Main Menu? Type 'yes' or 'no' .");
        backToMainMenu = sc.next();
       
    }
        
        
    public static void Deserts() {
        do {

            System.out.println("Enter '1' for Hot Chocolate                160.00\nEnter '2' for Chocolate Brownie                150.00\nEnter '3' Vanilla Ice Cream             145.00\nEnter '4' for Gulab Jamun             100.00\nEnter '5' for Ras Malai             110.00\nEnter '6' for Pudding               130.00\n");
            item = sc.nextInt();
                       
            switch (item) {
                case 1:
                sum = sum + 160;
                orders += "Hot Chocolate				160.00\n";
                break;
                
                case 2: 
                sum = sum + 150;
                orders += "Chocolate Brownie				150.00\n";
                break;
                
                case 3:
                sum = sum + 145;
                orders += "Vanilla Ice Cream				145.00\n";
                break;
                
                case 4:
                sum = sum + 100;
                orders += "Gulab Jamun				100.00\n";
                break;

                case 5:
                sum = sum + 110;
                orders += "Ras Malai				110.00\n";
                break;

                case 6:
                sum = sum + 130;
                orders += "Pudding				130.00\n";
                break;
                
                default:
                System.out.println("");
                
            }
            
            System.out.println("Do you like to add another item from Deserts? \nType 'yes' or 'no'");
            anotherItem = sc.next();
           
            
        } while (anotherItem.equals("yes"));
        System.out.println("Do you want to go back to Main Menu? Type 'yes' or 'no' .");
        
        backToMainMenu = sc.next();
        
    }

    public static void Drinks() {
        do {

            System.out.println("Enter '1' for Favourite-Mojito                170.00\nEnter '2' for Electric Lemonade                170.00\nEnter '3'Milk Shake(Any Flavour)              160.00\nEnter '4' for Aerated Drinks             85.00\nEnter '5' Packaged Water             45.00\nEnter '6' for Cold Coffee/Ice Tea               95.00\n");
            item = sc.nextInt();
            
            switch (item) {
                case 1:
                sum = sum + 170;
                orders += "Favourite-Mojito				170.00\n";
                break;
                
                case 2: 
                sum = sum + 170;
                orders += "Electric Lemonade				170.00\n";
                break;
                
                case 3:
                sum = sum + 160;
                orders += "Milk Shakes				\n";
                break;
                
                case 4:
                sum = sum + 85;
                orders += "Aerated Drinks				\n";
                break;
                
                case 5:
                sum = sum + 45;
                orders += "Packaged Water				\n";
                break;
                
                case 6:
                sum = sum + 95;
                orders += "Cold Coffee/Ice Tea\n";
                break;
                
                default:
                System.out.println("");
                
            }
            
            System.out.println("Do you like to add another item from Drinks? \nType 'yes' or 'no'");
           anotherItem = sc.next();
                      
        } while (anotherItem.equals("yes"));
       
        System.out.println("Do you want to go back to Main Menu? Type 'yes' or 'no' .");
        backToMainMenu = sc.next();
        
    }

    public static void Start() {
        System.out.println("---WELCOME TO INDIAN SPICES---\n\n");
    }

    public static void Bill() {
       System.out.println("\n");
       System.out.println("You have ordered \n" + orders);
       System.out.println("Your total bill is " + sum);
       System.out.println("Thankyou for Coming!\nVisit us again!");
    }

}
	

