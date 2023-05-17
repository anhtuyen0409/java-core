
package javacore.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * class này giới thiệu các phương thức thông dụng trong ArrayList
 * sử dụng các static method cho ArrayList (có sự thay đổi trực tiếp đến các phần tử trong ArrayList (thêm,xóa,sửa...)) bằng cách: NameArrayList.staticMethod
 * @author HS
 */
public class ArrayListOperation {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<String>();
        
        //add
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
       
        //remove
        colors.remove("Green");
        
        //add again
        colors.add("Pink");
        colors.add("Yellow");
        
        //get (index in ArrayList from 0)
        colors.get(1);
        
        //search
        System.out.println(colors.contains("Orange"));
        
        //size
        System.out.println(colors.size());
        
        //print
        System.out.println(colors);
        
        //convert to array
        Object[] arr = colors.toArray();
        //sử dụng vòng lặp for để hiển thị phần tử trong mảng arr
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
