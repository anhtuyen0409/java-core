
package javacore.String;

/**
 * class này giới thiệu phương thức tìm vị trí của 1 ký tự hay 1 chuỗi nào đó trong chuỗi cha
 * @author HS
 */
public class IndexOfExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //tạo đối tượng string
        String s1 = "Hello java";
        
        //tìm vị trí của ký tự 'o'
        int index1 = s1.indexOf('o');
        System.out.println("index1 = "+index1);
        
        //tìm vị trí của chuỗi "java"
        int index2 = s1.indexOf("java");
        System.out.println("index2 = "+index2);
    }
}
