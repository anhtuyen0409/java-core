
package javacore.array;

/**
 * class này giới thiệu mảng trong java
 * @author HS
 */
public class TestArray {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khai báo và khởi tạo mảng
        int a[] = new int[3];
        
        a[0] = 10; //gán giá trị
        a[1] = 20;
        a[2] = 30;
        
        //in gia trị
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
    }
}
