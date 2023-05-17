
package javacore.oop;

/**
 * class này giới thiệu cách dùng từ khóa this trong java
 * cách dùng:
 * 1. tham chiếu đến các biến instance (thuộc tính)
 * 2. tham chiếu đến các constructor
 * 3. tham chiếu đến các method
 * @author HS
 */
public class SinhVien {
    private int id;
    private String name;
    private String email;
    
    //khởi tạo constructor
    public SinhVien(int id, String name){
        this.id = id; //dùng từ khóa this để tham chiếu biến instance
        this.name = name;
    }
    
    //khởi tạo constructor khác có từ khóa this gọi constructor ở trên
    public SinhVien(int id, String name, String email){
        /*cách 1: làm như bình thường
        this.id = id;
        this.name = name;
        this.email = email;*/
        
        //cách 2: dùng từ khóa this để gọi constructor ở trên
        this(id,name);
        this.email = email;
    }
    
    public void disPlay(){
        System.out.println(name);
        this.show(); //dùng từ khóa this để gọi method show()
    }
    
    public void show(){
        System.out.println(email);
    }
    
    public static void main(String[] args) {
        //khởi tạo đối tượng
        SinhVien sv1 = new SinhVien(1,"Nguyễn Văn A");
        SinhVien sv2 = new SinhVien(2,"Nguyễn Văn B","nguyenvanb@gmail");
        sv1.disPlay();
        sv2.disPlay();
    }
}
