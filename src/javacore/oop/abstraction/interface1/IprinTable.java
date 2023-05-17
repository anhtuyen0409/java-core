
package javacore.oop.abstraction.interface1;

/**
 * interface trong java như là 1 bản thiết kế, các method hoàn toàn là trừu tượng
 * interface hỗ trợ đa kế thừa trong java, nghĩa là 1 class có thể imlements nhiều interface
 * interface là tập hợp các hằng số và khai báo phương thức
 * mức độ truy cập mặc định các phương thức trong interface là public
 * @author HS
 */
public interface IprinTable {
    public static final float PI = 3.14f;
    
    void print();
    void show();
}
