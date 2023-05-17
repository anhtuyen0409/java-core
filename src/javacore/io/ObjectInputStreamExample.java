
package javacore.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * giới thiệu đọc Object ra file bằng ObjectInputStream 
 * đọc Object từ file txt đã lưu trước đó và hiển thị ra màn hình console
 * @author HS
 */
public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException{
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/javacore/testout.txt"));
            //read student
            Student std = (Student)ois.readObject();
            //show student
            System.out.println(std.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            ois.close();
        }
    }
}
