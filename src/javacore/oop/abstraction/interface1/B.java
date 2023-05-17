
package javacore.oop.abstraction.interface1;

/**
 * @author HS
 */
public class B implements IPrinTable3{
    @Override
    public void print(){
        System.out.println("Hello Java");
    }
    
    @Override
    public void show(){
        System.out.println("Hello World");
    }
    
    @Override
    public void display(){
        System.out.println("display method");
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.print();
        b.display();
    }
}
