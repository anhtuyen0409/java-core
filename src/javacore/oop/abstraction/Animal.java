
package javacore.oop.abstraction;

/**
 * class này giới thiệu tính trừu tượng abstract trong java
 * @author HS
 */
abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meo meo");
    }
}

class TestAbstraction{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}