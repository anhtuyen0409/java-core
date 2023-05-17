
package javacore.StringBuffer;

/**
 * class này giới thiệu lớp StringBuilder trong java
 * StringBuilder giống với StringBuffer chỉ có điều StringBuilder không đồng bộ
 * @author HS
 */
public class StringBuilderExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng StringBuilder
        StringBuilder sb = new StringBuilder("Hello ");
        
        //add nội dung vào
        sb.append("java"); //đến đây chuỗi ban đầu đã thay đổi
        
        System.out.println(sb);
    }
}
