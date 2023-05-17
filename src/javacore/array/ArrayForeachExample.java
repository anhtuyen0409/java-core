
package javacore.array;

/**
 * class này giới thiệu duyệt mảng bằng vòng lặp foreach
 * @author HS
 */
public class ArrayForeachExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khai báo mảng các string
        String[] fruits = new String[] {"Apple","Apricot","Banana"};
        
        //sử dụng vòng lặp foreach để duyệt các phần tử trong mảng
        for(String fruit : fruits){
            System.out.print(fruit+"  ");
        }
        System.out.println("");
    }
}
