/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class Book {
    String title; 
    int price; 

    public Book() {
        
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter new price: ");
        this.price = price = sc.nextInt(); 
        System.out.println("The new price is: " + price);
        
        
    }    
}
