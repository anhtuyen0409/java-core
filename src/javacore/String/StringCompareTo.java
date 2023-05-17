
package javacore.String;

/**
 * class ngày giới thiệu phương thức so sánh các giá trị theo thứ tự từ điển và trả về giá trị 1 số nguyên
 * compare to so sánh theo thứ tự alphapet
 * @author HS
 */
public class StringCompareTo {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Java";
        
        //so sánh bằng compareTo()
        System.out.println(s1.compareTo(s2)); //s1 = s2
        System.out.println(s1.compareTo(s3)); //s1 < s3
        System.out.println(s3.compareTo(s1)); //s3 > s1
    }
}
