
package javacore;

import java.util.Scanner;

/**
 * class này giới thiệu về câu lệnh switch case trong java
 * @author HS
 */
public class SwitchCaseExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khai báo biến age
        int age;
        Scanner sc = new Scanner(System.in);
        
        //nhập giá trị cho biến age
        System.out.println("Input your age: ");
        age = sc.nextInt();
        
        //sử dụng câu lệnh switch case
        switch(age){
            case 10:{
                System.out.println("You are 10 years old");
                break;
            }
            case 20:
            case 30:
            case 40:{
                System.out.println("You are "+age+" years old");
                break;
            }
            default:{
                System.out.println("Other age");
                break;
            }
        }
        
        //close
        sc.close();
    }
}
