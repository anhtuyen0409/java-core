
package javacore.String;

/**
 * class này giới thiệu phương thức tính độ dài của chuỗi
 * @author HS
 */
public class StringLength {
    /**
     * method main
     */
    public static void main(String[] args) {
        //tạo đối tượng string
        String str = "hello";
        
        //tính chiều dài của chuỗi
        int length = str.length();
        System.out.println("length = "+length);
    }
}
