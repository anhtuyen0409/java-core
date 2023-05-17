
package javacore.oop.modifier.public1;

/**
 * class này giới thiệu các phạm vi truy cập trong java
 * @author HS
 */
public class A {
    private void msg(){
        System.out.println("Hello");
    }
    
    public void disPlay(){
        this.msg(); //có thể gọi method msg() vì cùng class A
        System.out.println("Display method");
    }
}
