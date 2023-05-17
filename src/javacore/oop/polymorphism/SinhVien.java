
package javacore.oop.polymorphism;

/**
 *
 * @author HS
 */
public class SinhVien {
    private int id;
    private String name;
    private String email;
    
    //khởi tạo constructor cùng là 1 dạng của overloading
    public SinhVien(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public SinhVien(int id, String name, String email){
        this(id,name);
        this.email = email;
    }
    
    public void display(){
        System.out.println(name);
        this.showEmail();
    }
    
    public void showEmail(){
        System.out.println(email);
    }
    
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Nguyễn Văn A");
        sv1.display();
        
        SinhVien sv2 = new SinhVien(2,"Nguyễn Văn B","nguyenvanb@");
        sv2.display();
    }
}
