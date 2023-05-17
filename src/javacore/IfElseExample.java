
package javacore;

import java.util.Scanner;

/**
 * class này giới thiệu về câu lệnh if - else, if -else if - else
 * @author HS
 */
public class IfElseExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        
        //nhập giá trị cho biến a
        System.out.println("Input value of a: ");
        a = sc.nextInt();
        
        //sử dụng câu lệnh if - else if - else
        if(a > 0){
            System.out.println("a > 0");
        }
        else if(a < 0){
            System.out.println("a < 0");
        }
        else{
            System.out.println("a = 0");
        }
        sc.close();
    }
}
