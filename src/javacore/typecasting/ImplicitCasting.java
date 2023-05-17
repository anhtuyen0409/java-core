
package javacore.typecasting;

/**
 * class này giới thiệu về ép kiểu không tường minh trong java
 * @author HS
 */
public class ImplicitCasting {
    /**
     * method main
     * @param args 
     */
    public static void main(String[] args) {
        /* + ép kiểu không tường minh (nghĩa là ép từ kiểu dl nhỏ -> lớn. vd: byte->short->int->long->float->double...)
           + implicit casting sẽ không làm mất mát dữ liệu*/
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("f = "+f);
    }
}
