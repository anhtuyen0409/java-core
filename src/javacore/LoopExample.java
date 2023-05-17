
package javacore;

/**
 * class này giới thiệu các vòng lặp trong java : while, do while, for
 * @author HS
 */
public class LoopExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //sử dụng vòng lặp for in các số từ 1 đến 10
        System.out.println("Sử dụng vòng lặp for:");
        for(int i=1; i<=10; i++){
            System.out.print(i+"\t");
        }
        
        //sử dụng vòng lặp while in các số từ 1 đến 10
        System.out.println("\nSử dụng vòng lặp while:");
        int i = 1;
        while(i <= 10){
            System.out.print(i+"\t");
            i++;
        }
        
        //sử dụng vòng lặp do while in các số từ 1 đến 10
        System.out.println("\nSử dụng vòng lặp do while:");
        i = 1;
        do{
            System.out.print(i+"\t");
            i++;
        }while(i <= 10);
    }
}
