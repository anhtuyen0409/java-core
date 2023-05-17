
package javacore.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HS
 */
public class CollectionExample1 {
    public static void main(String[] args) {
        
        //khai bái 1 ArrayList
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList: "+arrayList);
        
        //khai báo 1 LinkedList
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList: "+linkedList);
        
        //khai báo 1 HashMap
        Map<String,String>hashMap = new HashMap<String,String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "KP");
        hashMap.put("Language1", "Java");
        hashMap.put("Language2", ".NET");
        System.out.println("Các phần tử của HashMap: " + hashMap);
        
        //khai báo 1 HashSet
        Set<String>hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của HashSet: " + hashSet);
    }
}
