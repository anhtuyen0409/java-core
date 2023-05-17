
package javacore.oop.inheritance;

/**
 * class dog có thể truy cập được các thuộc tính và method của class animal
 * @author HS
 */
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
    
    void show(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.show();
    }
}
