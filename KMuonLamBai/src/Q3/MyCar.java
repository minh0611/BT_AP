/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class MyCar implements ICar {
    static Scanner sc = new Scanner(System.in);
    
    static List<Car> carList = new ArrayList<Car>();

    @Override
    public int f1(List<Car> t) {
        int count = 0;
        int average = 0;
        for (int i = 0; i < t.size(); i++) {
            count++;
            average += t.get(i).getRate();
        }
        return average / count;
    }

    @Override
    public void f2(List<Car> t) {

    }

    @Override
    public void f3(List<Car> t) {

    }
     public static int f12(List<Car> t) {
        int count = 0;
        int average = 0;
        for (int i = 0; i < t.size(); i++) {
            count++;
            average += t.get(i).getRate();
        }
        return average / count;
    }
    public static void main(String[] args) {
        System.out.println("Element want to input: ");
        int input = sc.nextInt();
        do {
            Car car = new Car();
            System.out.println("Enter maker: ");
            car.maker = sc.next();
            System.out.println("Enter rate: "); 
            car.rate = sc.nextInt();
            
            carList.add(car);
        } while (carList.size() < input);
        System.out.println("Average of car list: \n " + carList.toString() + "\n");
        System.out.println(f12(carList));
    }
}
