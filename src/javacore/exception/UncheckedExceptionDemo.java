
package javacore.exception;

/**
 *
 * @author HS
 */
public class UncheckedExceptionDemo {
    
    public static void main(String[] args) {
        UncheckedExceptionDemo.testUncheckedException();
    }
    
    //tự định nghĩa lỗi MyUncheckedException
    public static void testUncheckedException() throws MyUncheckedException{
        System.out.println("Unchecked exception demo!");
        throw new MyUncheckedException("Unchecked exception");
    }
}
