
package javacore.oop.encapsulation;

/**
 * class giới thiệu tính đóng gói trong java
 * @author HS
 */
public class BankAccount {
    private double balance = 0;
    
    //kiểu truyền tham trị -> giá trị của parameter x sẽ không thay đổi dù trong method có làm gì
    //kiểm tra x >=0 ?
    public void deposit(double x){
        if(x >= 0){
            this.balance += x;
        }
    }
    
    //lấy kết quả
    public double getBalance(){
        return this.balance;
    }
}
