
package javacore.String;

/**
 * class này giới thiệu phương thức trim xóa khoảng trắng ở đầu chỗi và cuối chuỗi
 * @author HS
 */
public class StringTrimExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //tạo đối tượng string
        String s1 = "  hello string   ";
        
        //in nội dung trước khi xóa khoảng trắng
        System.out.println(s1+"java");
        
        //in nội dung sau khi xóa khỏang trắng 
        System.out.println(s1.trim()+"java");
    }
}
