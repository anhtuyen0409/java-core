/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.variable;

/**
 * class này giải thích một số vấn đề về biến trong java
 * @author HS
 */
public class Test {
    //static variable
    public static float PI = 3.14f;
    //instance variable
    public int n;/* có thể khởi tạo luôn giá trị cho biến instance và trong class main vẫn khởi tạo đối tượng bình thường vẫn đúng
    vd: public int n = 3*/
    public Test(int n){
        this.n = n;
    }
    /**
     * method main
     */
    public static void main(String[] args) {
        /*int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = scan.nextInt();
        System.out.println("a = "+a);
        - đối với biến local thì phải nên tạo giá trị cho nó, không thì nhập giá trị thông qua lớp scanner*/
        
        //local variable
        String str = "FirstName";
        System.out.println("Local variable: "+str);
        System.out.println("Static variable: "+Test.PI);
        //nếu ở trên có constructor có tham số truyền vào thì lúc khởi tạo object phải có tham số truyền vào
        Test ist = new Test(3); /*- nếu ở trên đã khởi tạo luôn giá trị cho biến instance thì không cần thêm giá trị ở phần này
        vd: Demo ist = new Demo();
        - nếu ở class trên không có constructor thì mặc định nó là constructor không có tham số truyền vào, nghĩa là các giá trị 
        của biến instance sẽ = 0 (đối với datatype là int,float,...)*/
        System.out.println("Instance variable: "+ist.n);
    }
}
