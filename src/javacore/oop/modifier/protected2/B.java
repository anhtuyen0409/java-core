
package javacore.oop.modifier.protected2;

import javacore.oop.modifier.protected1.A;

/**
 *
 * @author HS
 */
public class B extends A{
    public static void main(String[] args) {
        B object = new B();
        object.msg(); //có thể gọi method msg() từ class A (dù khác package vẫn truy cập được vì class B kế thừa class A)
    }
}
