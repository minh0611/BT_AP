/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;
/**
 *
 * @author Macbook2015
 */
public class Car {
    String maker; 
    int rate; 

    public Car() {
        
    }

    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    } 

    @Override
    public String toString() {
        return "Maker: " + getMaker() 
                +"Rate: " + getRate();
    }
    
}
