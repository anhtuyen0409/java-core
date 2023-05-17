
package javacore.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Sử dụng DileReader và FileWriter để đọc ghi file Unicode (16 bit)
 * @author HS
 */
public class CopyFileCharacter {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("src/javacore/input.txt");
            out = new FileWriter("src/javacore/output.txt");
            
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
