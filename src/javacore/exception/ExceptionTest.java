
package javacore.exception;

/**
 *
 * @author HS
 */
public class ExceptionTest {
    
    public static void main(String[] args) {
        //NullPointerException
        /*String strObject = null;
        //so sánh với hằng số
        if(strObject.equals("Java")){
            System.out.println("Hello java");
        }*/
        
        //java.lang.ArrayIndexOutOfBoundsException
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        //truy xuất phần tử mảng index = 5
        System.out.println(arrInt[5]);
    }
}
