
package javacore.oop.abstraction.interface1;

/**
 * class implements interface thì phải override đầy đủ các method trong interdace đó
 * @author HS
 */
public class A implements IprinTable, IPrinTable2{
    @Override
    public void print(){
        System.out.println("Hello"); 
    }
    
    @Override
    public void show(){
        System.out.println("Show Hello");
        System.out.println(PI);
    }
    
    @Override
    public void display(){
        System.out.println("display method");
    }
    
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.show();
        a.display();
    }
}
