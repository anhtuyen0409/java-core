
package javacore.String;

/**
 * class này giới thiệu về lớp string trong java
 * khi 1 đối tượng string tạo ra thì nội dung của nó sẽ không thể thay đổi được. vd: nếu muốn thêm nội dung vào chuỗi ban đầu (concat()...) thì sẽ tạo đối tượng string mới
 * giới thiệu về so sánh tham chiếu (có cùng trỏ tới 1 đối tượng trong ô nhớ không)
 * @author HS
 */
public class StringExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //tạo đối tượng string literal
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        
        //so sánh các đối tượng với nhau
        System.out.println(s1==s2); //so sánh s1 và s2 có cùng trỏ tới 1 đối tượng trong vùng nhớ không
        System.out.println(s1==s3); //so sánh s1 và s3 có cùng trỏ tới 1 đối tượng trong vùng nhớ không
        
        //tạo đối tượng string bằng toán tử new
        String s4 = new String("hello");
        String s5 = new String("hello");
        
        //kiểm tra đối tượng s4 và s5 có trỏ đến cùng 1 đối tượng trong vùng nhớ không
        System.out.println(s4==s5);
    }
}
