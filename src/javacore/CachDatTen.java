
package javacore;

/**
 * class này hướng dẫn cách đặt tên trong java
 * trong bài này sẽ hướng dẫn luôn cách ghi chú trong java
 * @author HS
 */
public class CachDatTen {
    //khai báo hằng số
    public static final int HOUR_OF_DAY = 24;
    /**
     * method này dùng để in ra dòng chữ "have a nice day!"
     */
    public static void sayHello(){
        //khai báo biến local helloString
        String helloString = "Have a nice day!";
        
        //in nội dung ra màn hình
        System.out.println(helloString);
    }
    /**
     * method main
     */
    public static void main(String[] args) {
        System.out.println("Một ngày có "+HOUR_OF_DAY+" giờ");
        
        //gọi method sayHello
        sayHello();
    }
}
