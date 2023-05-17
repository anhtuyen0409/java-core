
package javacore.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * class này giới thiệu class LinkedList trong interface List
 * LinkedList cũng tương tự như ArrayList, khác ở chỗ các thao tác thêm xóa sửa sẽ nhanh hơn ArrayList
 * @author HS
 */
public class LinkedListOperation {
    
    public static void main(String[] args) {
        
        //create LinkedList
        List<String> linkedList = new LinkedList<String>();
        //add objects to LinkedList
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        
        //show líst through Iterator
        System.out.println("Show list through Iterator:");
        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        
        //add first
        linkedList.add(0, "Python");
        
        //add last
        linkedList.add(linkedList.size(), "Ruby");
        
        //xuống dòng
        System.out.println();
        
        //show list through for-each
        System.out.println("Show list through for-each:");
        for(String obj : linkedList){
            System.out.print(obj + "  ");
        }
        
        //firstNode & lastNode
        String firstNode = linkedList.get(0);
        String lastNode = linkedList.get(linkedList.size()-1);
        
        System.out.println();
        System.out.println("firstNode: " + firstNode); //Python
        System.out.println("lastNode: " + lastNode); //Ruby
        
        //update element
        linkedList.set(3, "PHP-update"); //PHP -> PHP-update
        
        System.out.println();
        System.out.println("List after change:");
        System.out.println(linkedList + "  ");
    }
}
