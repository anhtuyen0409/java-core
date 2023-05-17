
package javacore.String;

/**
 * class này giới thiệu cách chuyển chuỗi thành chữ hoa và chữ thường
 * toUpperCase: chuyển chuỗi thành chữ hoa
 * toLowerCase: chuyển chuỗi thành chữ thường
 * @author HS
 */
public class StringLowerUpperExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //tạo đối tượng string
        String s1 = "HELLO java";
        
        //chuyển thành chữ thường
        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower);
        
        //chuyển thành chữ hoa
        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper);
    }
}
