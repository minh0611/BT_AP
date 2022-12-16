/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class bookMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter title: "); 
        String title = sc.nextLine(); 
        System.out.println("Enter price: "); 
        int price = sc.nextInt();
        Book book = new Book(title, price); 
        int choose;
        
        do {
            System.out.println("1. test getTitle()"); 
            System.out.println("2. test setPrice()"); 
            System.out.println("Choose an option: "); 
            choose = sc.nextInt(); 
            
            switch (choose) {
                case 1 -> System.out.println(book.getTitle());
                case 2 -> book.setPrice(price); 
                default -> System.out.println("Incorrect input");
            }
        }while (choose != 2);
    }
    
}
