
package javacore.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * giới thiệu về đọc ghi dữ liệu trong java
 * sử dụng FileInputStream và FileOutputStream để đọc ghi file byte
 * @author HS
 */
public class CopyFileByte {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        
        try {
            inputStream = new FileInputStream("src/javacore/inStream.txt"); //đọc file
            outputStream = new FileOutputStream("src/javacore/outStream.txt"); //ghi file
            
            int c;
            while((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        }
        //dù chương trình bị lỗi thì cũng phải đóng luồng
        finally {
            if(inputStream != null){
                inputStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
}
