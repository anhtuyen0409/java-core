
package javacore.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * giới thiệu ghi đối object ra file bằng ObjectOutputStream
 * ghi Object ra file txt
 * @author HS
 */
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/javacore/testout.txt"));
            //create student
            Student std = new Student(1,"Nguyen Anh Tuyen","Cat Hung",20);
            //write student
            oos.writeObject(std);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally{
            oos.close();
        }
    }
}
