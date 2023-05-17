
package javacore.oop.static1;

/**
 *
 * @author HS
 */
public class MyClass {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        //đếm số đối tượng tạo ra từ class Counter
        System.out.println("Count: "+Counter.COUNT);
        
        //call static method
        Counter.sayHi();
    }
}
