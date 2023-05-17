
package javacore.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * class này giới thiệu các phương thức tĩnh có sẵn trong các class collection
 * sử dụng các static method trong ArrayList bằng cách : Collection.[static method](ArrayList Name);
 * @author HS
 */
public class StaticMethod {
    public static void main(String[] args) {
        
        List<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        
        //sort string
        Collections.sort(animals);
        System.out.println("Animals sort: " + animals);
        
        //number
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);
        
        //sort integer
        Collections.sort(nums);
        System.out.println("Numbers sort: " + nums);
        
        //find max, min
        System.out.println("Max = " + Collections.max(nums));
        System.out.println("Min = " + Collections.min(nums));
        
        //reverse
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("PHP");
        myList.add("Python");
        myList.add("COBOL");
        System.out.println("Original list: " + myList);
        //đảo ngược list
        Collections.reverse(myList);
        System.out.println("Modified list: " + myList);
    }
}
