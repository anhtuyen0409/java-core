
package javacore.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * giới thiệu đọc ghi file trong java bằng BufferedInputStream/BufferedOutputStream
 * @author HS
 */
public class CopyFileBuffer1 {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bufferIn = null;
        BufferedOutputStream bufferOut = null;
        
        try {
            InputStream inputStream = new FileInputStream("src/javacore/inStream.txt");
            OutputStream outputStream = new FileOutputStream("src/javacore/output.txt");
            
            bufferIn = new BufferedInputStream(inputStream);
            bufferOut = new BufferedOutputStream(outputStream);
            
            int c;
            while((c = bufferIn.read()) != -1){
                bufferOut.write(c);
            }
        } finally {
            if(bufferIn != null){
                bufferIn.close();
            }
            if(bufferOut != null){
                bufferOut.close();
            }
        }
    }
}
