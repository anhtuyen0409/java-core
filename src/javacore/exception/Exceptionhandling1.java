
package javacore.exception;

/**
 *
 * @author HS
 */
public class Exceptionhandling1 {
    
    public static void main(String[] args) {
        
        try {
            int a[] = new int[2];
            System.out.println(a[5]); //truy cập phần tử ngoài mảng
        } catch (Exception e) {
            System.err.println("Lỗi xảy ra");
        }
    }
}
