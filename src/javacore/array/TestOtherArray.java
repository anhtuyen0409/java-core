
package javacore.array;

/**
 * class này giới thiệu mảng và cách khởi tạo mảng nặc danh trong java
 * @author HS
 */
public class TestOtherArray {
    /**
     * method main
     */
    public static void main(String[] args) {
        //gán mảng nặc danh cho mảng a
        int a[] = {33,3,4,5};
        
        //in giá trị
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
    }
}
