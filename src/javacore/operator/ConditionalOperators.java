
package javacore.operator;

/**
 * class này giới thiệu về các toán tử điều kiện và logic trong java
 * @author HS
 */
public class ConditionalOperators {
    /**
     * method main
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        //toán tử AND thể hiện bằng ký tự &&
        boolean check = (a==b) && (a>b);
        System.out.println(check);
        
        //toán tử OR thể hiện bằng ký tự ||
        check  = (a==b) || (a>b);
        System.out.println(check);
        
        //toán tử điều kiện
        String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
        System.out.println(s);
    }
}
