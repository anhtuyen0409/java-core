
package javacore.typecasting;

/**
 * class này có nội dung ép kiểu tường minh trong java
 * @author HS
 */
public class ExplicitCasting {
    /**
     * method main
     * @param args 
     */
    public static void main(String[] args) {
        /* + ép kiểu tường minh (nghĩa là ép từ kiểu dl lớn -> nhỏ. vd: double->float->long->int->short->byte)
           + explicit casting có thể gây mất mát dữ liệu*/
        float f = 100.04f;
        long l = (long)f;
        int i = (int)l;
        System.out.println("f = "+f);
        System.out.println("l = "+l);
        System.out.println("i = "+i);
    }
}
