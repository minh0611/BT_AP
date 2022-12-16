/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class CarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter maker: "); 
        String maker = input.nextLine(); 
        System.out.println("Enter price"); 
        int price = input.nextInt(); 
        System.out.println("Enter type: "); 
        int type = input.nextInt(); 
        
        int choose = 0; 
        Car c =  new Car(maker, price);
        SpecCar sc = new SpecCar(maker, price, type); 
        
        do {            
            System.out.println("1. Test toString()"); 
            System.out.println("2. Test setData()"); 
            System.out.println("3. Test getValue()"); 
            System.out.println("Choose a function: ");
            
            choose = input.nextInt(); 
            switch (choose) {
                case 1 -> {
                    System.out.println(c.toString());
                    System.out.println(sc.toString());
                    break;
                }
                case 2 -> sc.setData(); 
                case 3 -> sc.getValue(); 
                default -> System.out.println("Incorrect input");
            }
            
        } while (choose != 3);
    }
    
}
