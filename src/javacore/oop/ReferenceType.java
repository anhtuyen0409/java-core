
package javacore.oop;

/**
 * class ngày giới thiệu cách truyền tham chiếu
 * tham chiếu đến các object, interface, array
 * những thay đổi bên trong phương thức sẽ ảnh hưởng đến bên ngoài phương thức
 * @author HS
 */
public class ReferenceType {
    public static void main(String[] args) {
        person p;
        p = new person("John");
        p.setAge(20);
        celebrateBirthday(p);
        System.out.println(p.getAge());
    }
    
    //parameter là 1 object nên những thay đổi trong phương thức sẽ ảnh hưởng tới bên ngoài phương thức
    static void celebrateBirthday(person p){
        p.setAge(p.getAge() + 1);
    }
}
