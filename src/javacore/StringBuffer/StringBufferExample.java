
package javacore.StringBuffer;

/**
 * class nàu giới thiệu lớp StringBuffer trong java
 * StringBuffer cũng tương tự với lớp String ngoại trừ nó có thể thay đổi trực tiếp trên đối tượng đó mà không phải tạo 1 đối tượng mới trong bộ nhớ như lớp string 
 * @author HS
 */
public class StringBufferExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng StringBuffer
        StringBuffer sb = new StringBuffer("Hello ");
        
        //add thêm vào chuỗi ban đầu
        sb.append("java"); //đến đây chuỗi ban đầu đã bị thay đổi
        
        System.out.println(sb);
    }
}
