
package javacore.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * class này giới thiệu HashSet trong java
 * HashSet implements Set interface
 * @author HS
 */
public class HashSetOperator {
    
    public static void main(String[] args) {
        
        //khai báo 1 HashSet có tên là hashSet kiểu dữ liệu Integer
        Set<Integer> hashSet = new HashSet<>();
        
        //thêm các phần tử vào HashSet sử dụng phương thức add
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(6);
        
        //duyệt bằng cách sử dụng Iterator
        System.out.println("Các phần tử có trong HashSet:");
        Iterator<Integer> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "  ");
        }
        
        System.out.println(); //new line
        
        //kiểm tra phần tử
        if(hashSet.contains(6)){
            System.out.println("Tồn tại phần tử!");
        }
        else{
            System.out.println("Không tồn tại phần tử!");
        }
        
        //xóa phần tử khỏi tập hợp
        hashSet.remove(1);
        System.out.println("Các phần tử sau khi remove:");
        System.out.println(hashSet + "  ");
        
        //clear all
        hashSet.clear();
        System.out.println("Các phần tử sau khi clear all:");
        System.out.println(hashSet + "  ");
    }
}
