
package javacore.oop;

/**
 * class này giới thiệu cách tạo đối tượng trong OOP 
 * @author HS
 */
public class Car {
    //thuộc tính
    private String name;
    
    //khởi tạo constructor
    public Car(String name){
        this.name = name;
    }
    
    //hiển thị thông tin
    public void show(){  //không có tham số truyền vào dùng void 
        System.out.println(name);
    }
    
    //method main
    public static void main(String[] args) {
        //khởi tạo đối tượng bằng từ khóa new
        Car toyota = new Car("Toyota");
        Car ford = new Car("Ford");
        
        //hiển thị thông tin các đối tượng
        toyota.show();
        ford.show();
    }
}
