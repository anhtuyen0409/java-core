
package javacore.oop.static1;

/**
 * class này giới thiệu static trong java
 * static tạo các thuộc tính, phương thức tĩnh trong java, nghĩa là nó được tạo ra song song với class, phạm vi truy cập trong class
 * @author HS
 */
public class Counter {
    //thuộc tính tĩnh
    public static int COUNT = 0;
    
    //mỗi lần khởi tạo constructor thì count++
    Counter(){
        COUNT++;
    }
    
    //phương thức tĩnh
    public static void sayHi(){
        System.out.println("Hello static method!");
    }
}
