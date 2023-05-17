
package javacore.oop.super1;

/**
 *
 * @author HS
 */
public class Vehicle {
    int speed = 50;
    
    void showMe(){
        System.out.println("Show me...");
    }
}

//vì class là Vehicle.java nên class Bike không được public
class Bike extends Vehicle{
    int speed = 100;
    
    void display(){
        System.out.println(speed); //in speed của lớp con Bike
        super.showMe();
    }
    
    void display1(){
        System.out.println(super.speed); //in speed của lớp cha Vehicle
    }
    
    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
        b.display1();
    }
}
