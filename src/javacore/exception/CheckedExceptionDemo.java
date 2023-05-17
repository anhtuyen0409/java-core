
package javacore.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HS
 */
public class CheckedExceptionDemo {
    
    //method cố tình ném ra lỗi CheckedException để test
    public static void testCheckedException() throws CheckedException{
        System.out.println("Checked exception demo!");
    }
    
   
    public static void main(String[] args) {
        try {
            CheckedExceptionDemo.testCheckedException();
        } catch (CheckedException ex) {
            Logger.getLogger(CheckedExceptionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
