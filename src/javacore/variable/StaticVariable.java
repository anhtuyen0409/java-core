
package javacore.variable;

/**
 * class này giới thiệu về biến static trong java
 * @author HS
 */
public class StaticVariable {
    //biến static có phạm vi toàn chương trình
    public static int TOTAL = 5;
    public static int COUNT;
    /**
     * method main
     */
    public static void main(String[] args) {
        System.out.println("total: "+StaticVariable.TOTAL);
        System.out.println("count: "+StaticVariable.COUNT);
    }
}
