
package javacore.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * class này hướng dẫn cách duyệt danh sách trong collection bằng Iterator và vòng lặp foreach
 * Iterator<DataType of ArrayList> NameIterator = NameArrayList.iterator();
 * while(NameIterator.hasNext()){System.out.println(NaneIterator.Next())};
 * @author HS
 */
public class ArrayListExample1 {
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP");
        
        //show list through Iterator
        Iterator<String> str = arrayList.iterator();
        while(str.hasNext()){
            System.out.print(str.next() + ", ");
        }
        
        //xuống dòng
        System.out.println();
        
        //show list through foreach
        for(String s : arrayList){
            System.out.print(s + ", ");
        }
    }
}
