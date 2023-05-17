
package javacore.array;

/**
 * class này giới thiệu cách duyệt mảng bằng vòng lặp for trong java
 * @author HS
 */
public class DuyetMang {
    private static final int SIZE = 5;
    /**
     * method main
     */
    public static void main(String[] args) {
        int i;
        int[] ages = new int[SIZE]; //khai báo mảng
        
        //gán giá trị vào mảng
        for(i=0; i<SIZE; i++){
            ages[i] = 5 + i;
        }
        
        //in các giá trị của mảng
        for(i=0; i<SIZE; i++){
            System.out.print(ages[i]+"  ");
        }
        System.out.println("");
    }
}
