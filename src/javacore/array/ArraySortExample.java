
package javacore.array;

import java.util.Scanner;

/**
 * class này là bài tập về tìm kiếm phần tử mảng trong java
 * @author HS
 */
public class ArraySortExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        int n;
        
        //nhập dữ liệu bằng lớp scanner
        Scanner sc = new Scanner(System.in);
        
        //step 1: nhập số lượng phần tử mảng
        do{
            System.out.println("Nhập số lượng phần tử mảng:");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("Nhập lại!");
            }
        }while(n<=0);
        
        //step 2: khai báo và cấp phát bộ nhớ cho mảng
        int a[] = new int[n];
        
        //step 3: nhập giá trị cho các phần tử mảng
        System.out.println("Nhập giá trị các phần tử mảng: ");
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        
        //step 4: in các phần tử trong mảng
        System.out.print("Mảng các số nguyên: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+"  ");
        }
        
        //step 5: nhập số nguyên k từ bàn phím
        System.out.print("\nNhập k: ");
        int k = sc.nextInt();
        
        /*step 6: tìm kiếm phần tử đầu tiên trong mảng có giá trị = k và thông báo vị trí phần tử đó
        nếu không có phần tử nào có giá trị = k  thì thông báo "không có giá trị cần tìm"*/
        int index = n;
        for(int i=0; i<n; i++){
            if(a[i] == k){
                index = i;
                break;
            }
        }
        
        if(index == n){
            System.out.println("Không tìm thấy phần tử nào có giá trị k trong mảng");
        }
        else{
            System.out.println("Phần tử đầu tiên trong mảng có giá trị k tại vị trí "+index+" trong mảng");
        }
        
        //close
        sc.close();
    }
}
