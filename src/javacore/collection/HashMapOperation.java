
package javacore.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * class này giới thiệu HashMap trong java
 * HashMap implements Map interface
 * @author HS
 */
public class HashMapOperation {
    
    public static void main(String[] args) {
        
        //khai báo HashMap
        Map<String,String> hashMap = new HashMap<>();
        
        //thêm phần tử vào HashMap
        hashMap.put("Apple", "Táo");
        hashMap.put("Banana", "Chuối");
        hashMap.put("Orange", "Cam");
        
        //sử dụng Iterator để lấy toàn bộ key của HashMap
        //thông qua phương thức keyset()
        //vì các key có kiểu là String nên iterator cũng có kiểu là String
        Iterator<String> iteratorKey = hashMap.keySet().iterator();
        
        System.out.println("Key có trong HashMap là:");
        while(iteratorKey.hasNext()){
            System.out.print(iteratorKey.next() + "  ");
        }
        
        //sử dụng Iterator để lấy toàn bộ value của HashMap thông qua phương thức values()
        //vì các value có kiểu là String nên iterator cũng có kiểu là String
        Iterator<String> iteratorValue = hashMap.values().iterator();
        
        System.out.println();
        System.out.println("Value có trong HashMap:");
        while(iteratorValue.hasNext()){
            System.out.print(iteratorValue.next() + "  ");
        }
        
        //sử dụng Iterator để lấy toàn bộ entry của HashMap
        //vì 1 entry bao gồm key và value nên kiểu dữ liệu của Iterator sẽ bao gồm kiểu dữ liệu của key và value
        System.out.println();
        Iterator<Map.Entry<String,String>> iterator = hashMap.entrySet().iterator();
        System.out.println("Các entry có trong HashMap:");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        
        //kiểm tra phần tử có key tồn tại
        System.out.println();
        if(hashMap.containsKey("Apple")){
            System.out.println("Có Apple key trong HashMap");
        }
        
        //lấy giá trị phần tử theo key
        System.out.println("Lấy giá trị phần tử theo key: " + hashMap.get("Apple"));
        
        //clear(); xóa toàn bộ phần tử
    }
}
