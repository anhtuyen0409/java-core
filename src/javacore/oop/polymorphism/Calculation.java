
package javacore.oop.polymorphism;

/**
 * class này giới thiệu overloading trong java
 * 1 class có nhiều phương thức cùng tên nhưng khác tham số
 * @author HS
 */
public class Calculation {
    void sum(int a, int b){
        System.out.println(a + b);
    }
    
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        
        obj.sum(10, 10, 10);
        obj.sum(20, 20);
    }
}
