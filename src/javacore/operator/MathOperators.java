/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.operator;

/**
 * class này có nội dung giới thiệu về các phép toán thồng thường trong java
 * @author HS
 */
public class MathOperators {
    //method main
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        //tính tổng
        int tong = a + b;
        System.out.println("Tổng: "+tong);
        
        //tính hiệu
        int hieu = a - b;
        System.out.println("Hiệu: "+hieu);
        
        //tính tích
        int tich = a * b;
        System.out.println("Tích: "+tich);
        
        //chia lấy phần nguyên
        int phanNguyen = a / b;
        System.out.println("Phần nguyên: "+phanNguyen);
        
        //chia lấy phần dư
        int phanDu = a % b;
        System.out.println("Phần dư: "+phanDu);
        
        //toán tử một ngôi
        a++;
        System.out.println("Giá trị của a sau khi ++: "+a);
        
        b--;
        System.out.println("Giá trị của b sau khi --: "+b);
    }
}
