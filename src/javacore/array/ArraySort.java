
package javacore.array;

import java.util.Scanner;

/**
 * class này giới thiệu cách sắp xếp các phần tử trong java
 * @author HS
 */
public class ArraySort {
    /**
     * method main
     */
    public static void main(String[] args) {
        int n, temp, max = 100;
        
        //step 1: cấp phát bộ nhớ cho mảng
        int a[] = new int[max]; 
        
        //step 2: nhập số lượng phần tử cho mảng
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số lượng phần tử mảng: ");
            n = sc.nextInt();
            if( n<=2 || n > max-1 ){
                System.out.println("Nhập lại!");
            }
        }while( n<=2 || n > max-1 );
        
        //step 3: nhập giá trị cho mảng
        System.out.println("Nhập giá trị cho mảng:");
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        
        //step 4: in các phần tử ban đầu
        System.out.print("Mảng các số nguyên: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+"  ");
        }
        
        //step 5: sắp xếp mảng theo thứ tự tăng dần bằng thuật toán interchange sort
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        //step 6: in mảng số nguyên sau khi sắp xếp
        System.out.print("\nMảng sau khi sắp xếp tăng dần: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+"  ");
        }
        //close
        sc.close();
    }
}
