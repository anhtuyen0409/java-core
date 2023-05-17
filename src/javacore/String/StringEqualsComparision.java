
package javacore.String;

/**
 * class này giới thiệu phương thức so sánh nội dung các chuỗi
 * equals: so sánh có phân biệt hoa thường
 * equalsIgnoreCase: so sánh không phân biệt hoa thường
 * @author HS
 */
public class StringEqualsComparision {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "HELLO";
        
        //so sánh có phân biệt hoa thường
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        //so sánh không phân biệt hoa thường
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
