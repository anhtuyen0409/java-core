
package javacore.String;

/**
 * class này giới thiệu phương thức thay đổi ký tự/chuỗi cũ thành ký tự/chuỗi mới
 * @author HS
 */
public class ReplaceExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "Hello java";
        
        //thay các ký tự 'a' thành 'o'
        String replaceString1 = s1.replace('a', 'o');
        System.out.println(replaceString1);
        
        //thay thế chuỗi "java" thành "python"
        String replaceString2 = s1.replace("java", "python");
        System.out.println(replaceString2);
    }
}
