
package javacore;

/**
 * class này giới thiệu các loại biến
 * có 3 loại biến:
 * local: phạm vi trong 1 method
 * instance: phạm vi trong 1 object
 * static: phạm vi trong 1 class
 * @author HS
 */
public class CacLoaiBien {
    //khai báo biến static
    public static double PI = 3.14;
    
    //khai báo biến instance
    int n;
    public CacLoaiBien(int n){
        this.n = n;
    }
    public static void main(String[] args){
        //khai báo biến local
        int a = 2;
        CacLoaiBien object = new CacLoaiBien(5);
        System.out.print("local = " + a);
        System.out.print("\ninstance = " + object.n);
        System.out.print("\nstatic = " + PI);
        System.out.println();
    }
}
