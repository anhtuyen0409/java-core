
package javacore.oop;

/**
 * giới thiệu từ khóa this trong java và cách sử dụng
 * có 3 cách sử dụng từ khóa this trong java
 * cách 1: tham chiếu đến các biến instance
 * cách 2: gọi constructor của class hiện tại
 * cách 3: gọi method trong class hiện tại
 * @author HS
 */
public class ThisExample {
    private int id;
    private String name;
    private String email;
    
    //tạo constructor
    public ThisExample(int id, String name){
        this.id = id;    //sử dụng this để tham chiếu biến instance
        this.name = name;
    }
    
    //tạo constructor theo cách thông thường
    /*public ThisExample(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }*/
    
    //tạo constructor bằng cách sử dụng từ khóa this để gọi constructor trước đó
    public ThisExample(int id, String name, String email){
        this(id,name);
        this.email = email;
    }
    
    //sử dụng từ khóa this để gọi method showEmail
    public void disPlay(){
        System.out.println("ID: "+id+"\n"+"Tên: "+name);
        this.showEmail();
    }
    
    public void showEmail(){
        System.out.println("Email: "+email);
    }
    public static void main(String[] args){
        ThisExample sv1 = new ThisExample(1,"Nguyễn Văn A");
        sv1.disPlay();
        ThisExample sv2 = new ThisExample(2,"Nguyễn Văn B","nguyenvanb@gmail.com");
        sv2.disPlay();
    }
}
