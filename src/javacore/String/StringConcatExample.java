
package javacore.String;

/**
 * class này giới thiệu phương thức nối 2 chuỗi với nhau
 * có 2 cách nối chuỗi
 * cách 1: dùng phương thức concat()
 * cách 2: cộng trực tiếp 2 chuỗi với nhau
 * @author HS
 */
public class StringConcatExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "Hello";
        String s2 = "java";
        
        //CÁch 1: sử dụng concat() 
        String s3 = s1.concat(s2);
        System.out.println(s3);
        
        //Cách 2: cộng trực tiếp s1 với s2
        System.out.println(s1+s2);
    }
}
