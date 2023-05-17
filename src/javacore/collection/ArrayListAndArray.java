
package javacore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class này so sánh ArrayList và Array trong java
 * các phần tử trong array có thể là kiểu nguyên thủy cũng có thể là object
 * các phần tử trong ArrayList thì hoàn toàn là object
 * @author HS
 */
public class ArrayListAndArray {
    
    public static void main(String[] args) {
        //create ArrayList
        List<String> arrayList = new ArrayList<>();
        //adding string object to ArrayList
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
        
        //convert ArrayList to Array
        /*cách 1:
        Object[] arr = arrayList.toArray();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        */
        //cách 2:
        System.out.println("Convert ArrayList to Array:");
        String[] arr = arrayList.toArray(new String[arrayList.size()]);
        for(String str : arr){
            System.out.print(str + "  ");
        }
        
        //convert Array to ArrayList
        System.out.println();
        System.out.println("Convert Array to ArrayList:");
        List<String> list = new ArrayList<>();
        list = Arrays.asList(arr);
        //show list
        System.out.print(list + ", ");
    }
}
