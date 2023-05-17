
package javacore.oop;

/**
 * class này giới thiệu cách truyền tham trị
 * những thay đổi bên trong phương thức không ảnh hưởng đến giá trị của biên bên ngoài
 * @author HS
 */
public class ValueType {
    static void addOneTo(int num){
        num = num + 1;
    }
    
    public static void main(String[] args) {
        int x = 5;
        addOneTo(x); //method có access modifier là static nên có thể gọi trực tiếp, nếu không thì phải khởi tạo đối tượng xong mới gọi được
        System.out.println(x);
    }
}
