
package javacore.String;

/**
 * class này giới thiệu phương thức tìm ký tự trong chuỗi
 * việc tìm ký tự bắt đầu từ index = 0
 * @author HS
 */
public class CharAtExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        String name = "Hello java";
        
        //tìm ký tự tại index = 4
        char ch = name.charAt(4);
        System.out.println(ch); //result: o
    }
}
