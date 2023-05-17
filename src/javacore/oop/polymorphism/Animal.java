
package javacore.oop.polymorphism;

/**
 * class này giới thiệu tính đa hình trong java
 * tính đa hình xảy ra khi có 1 sự kế thừa các lớp có sự liên quan nhau
 * có thể thực hiện đa hình trong java bằng phương thức nạp chồng (overloading) và phương thức ghi đè (override)
 * phân biệt overriding và overloading
 * overiding: được kế thừa thừa từ 1 lớp cha và ghi đề các phương thức của lớp cha - > overiding
 * overloading: không cần kế thừa, trong 1 class có các phương thức trùng tên nhưng khác tham số -> overloading (các constructor cũng là 1 dạng của overloading)
 * @author HS
 */
public class Animal {
    public void makeSound(){
        System.out.println("default...");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("gâu gâu");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meo meo");
    }
}

class TestPolymorphism{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound();
        cat.makeSound();
        //có thể thấy dog và cat đều là Animal nhưng khi gọi makeSound() ứng xử là khác nhau, đó là tính đa hình
    }
}