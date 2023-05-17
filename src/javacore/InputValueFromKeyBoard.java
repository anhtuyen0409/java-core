
package javacore;

import java.util.Scanner;

/**
 * class này giới thiệu cách nhập giá trị từ bàn phím và in ra màn hình
 * để nhập gia trị từ bàn phím ta sử dụng lớp Scanner
 * để in gia trị ra màn hình ta sử dụng cú pháp: System.out.println();
 * @author HS
 */
public class InputValueFromKeyBoard {
    /**
     * method main
     */
    public static void main(String[] args) {
        //khởi tạo đối tượng nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        
        //khai báo biến nhập thông tin từ bàn phím
        String name;
        int age;
        
        System.out.println("Input your name: ");
        name = sc.nextLine();
        System.out.println("Input your age: ");
        age = sc.nextInt();
        
        //in thông tin đã nhập ra màn hình
        System.out.println("Your information:");
        System.out.println("Your name: "+name);
        System.out.println("Your age: "+age);
        
        //close
        sc.close();
    }
}
