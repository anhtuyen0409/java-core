
package javacore.oop.modifier.public1;

/**
 *
 * @author HS
 */
public class B {
    public static void main(String[] args) {
        A object = new A();
        object.disPlay(); //có thể gọi method display() trong class B vì modifier của method display() là public
        //không thể gọi method msg() trong class B vì modifier của method msg() là private
    }
}
