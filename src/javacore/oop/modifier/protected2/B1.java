
package javacore.oop.modifier.protected2;

import javacore.oop.modifier.protected1.A;

/**
 *
 * @author HS
 */
public class B1 {
    public static void main(String[] args) {
        A a = new A();
        //a.msg(); báo lỗi vì class B1 không kế thừa class A
    }
}
