
package javacore.exception;

/**
 * tự định nghĩa riêng lớp unchecked exception thì extends RuntimeException
 * @author HS
 */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String msg){
        super(msg);
    }
}
