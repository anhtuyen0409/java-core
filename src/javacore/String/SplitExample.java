
package javacore.String;

/**
 * class này giới thiệu phương thức tách chuỗi và trả về mảng chuỗi
 * split(): tách chuỗi
 * @author HS
 */
public class SplitExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng string
        String s1 = "Hello java";
        
        String[] words = s1.split("\\s"); //tách chuỗi dựa trên khoảng trắng
        //dùng vòng lặp foreach để in các element trong chuỗi vừa tách
        //s1.split("") => tách chuỗi theo từng ký tự
        for(String w : words){
            System.out.println(w);
        }
    }
}
