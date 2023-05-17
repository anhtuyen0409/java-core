
package javacore.String;

/**
 * class này giới thiệu phương thức trả về chuỗi con bằng hình thức cắt chuỗi từ vị trí index nào đó
 * @author HS
 */
public class SubstringExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "Hello java";
        
        //cắt từ vị trí index = 8
        System.out.println(s1.substring(8));
        
        //cắt chuỗi từ index =  3 tới index = 7
        System.out.println(s1.substring(3, 7));
    }
}
