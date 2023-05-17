
package javacore.exception;

/**
 *
 * @author HS
 */
public class TestArithmeticException {
    
    public static void main(String[] args) {
        try {
            div(10,0);
        } catch (ArithmeticException e) {
            System.err.println("Lỗi chia cho 0!");
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    //ném exception ra ngoài class main xử lý
    static int div(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Lỗi chia cho không");
        }
        else{
            return a/b;
        }
    }
}
