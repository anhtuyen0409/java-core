
package javacore.oop.encapsulation;

/**
 *
 * @author HS
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        //chuyển tiền
        account.deposit(10);
        
        //hiển thị balance
        System.out.println(account.getBalance());
    }
}
