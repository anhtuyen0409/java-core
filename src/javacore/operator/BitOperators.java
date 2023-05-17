
package javacore.operator;

/**
 * class này giới thiệu về các toán tử bit trong java
 * @author HS
 */
public class BitOperators {
    /**
     * method main
     */
    public static void main(String[] args) {
        //dùng Integer.toBinaryString để convert từ binary string sang kiểu int
        int a = 60; //60 = 0011 1100
        int b = 13; //13 = 0000 1101
        int c = 0;
        System.out.println("60 = "+Integer.toBinaryString(60));
        System.out.println("13 = "+Integer.toBinaryString(13));
        
        //dùng Integer.parseInt("00001100",2) để convert từ binary string sang kiểu int
        c = a & b; //12 = 0000 1100
        System.out.println("a & b = "+c);
        
        //dùng Integer.parseInt("00111101",2) để convert từ binary string sang kiểu int
        c = a | b; //61 = 0011 1101
        System.out.println("a | b = "+c);
        System.out.println("c = "+Integer.parseInt("00111101", 2));
    }
}
/*giải thích về AND và OR
AND: 2 mệnh đề đều đúng->đúng <=> 2 bit đều là 1->tổng=1 vd: 1+1=1, 1+0=0, 0+0=0
OR: 1 trong 2 mệnh đề có 1 mệnh đề đúng->đúng <=> 1 trong 2 bit có 1 bit=1 -> tổng=1  vd: 1+1=1, 1+0=1, 0+0=0
=> AND:  
    int a = 60 = 0011 1100
                +
    int b = 13 = 0000 1101
                -----------
                 0000 1100 = 12

   OR:
    int a = 60 = 0011 1100
                +
    int b = 13 = 0000 1101
                -----------
                 0011 1101 = 61
*/