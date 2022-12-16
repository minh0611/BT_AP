/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author Macbook2015
 */
public class SpecCar extends Car {
    int type; 

    public SpecCar() {
        
    }
    public SpecCar(String maker, int price,int type) {
        super(maker, price);
        this.type = type;
    } 

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public void setData() {
        this.maker = "XZ" + maker; 
        this.price = price + 20; 
        
        System.out.println("maker: " + maker); 
        System.out.println("price: " + price);
    }
    public int getValue() {
        int inc, result; 
        if (type < 7) {
            inc = 10;
            result = price + inc; 
            System.out.println(result);
        }else{
            inc = 15; 
            result = price + inc;
            System.out.println(result);
        }
        return result;
    }
    @Override
    public String toString() {
        return "\nMaker: " +  getMaker() +
                "\nPrice: " + getPrice() +
                "\ntype: " + getType();
    }
    
}
