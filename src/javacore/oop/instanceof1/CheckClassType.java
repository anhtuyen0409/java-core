
package javacore.oop.instanceof1;

/**
 * class này giới thiệu cách dùng instanceof trong java
 * instanceof dùng để kiển tra 1 đối tượng thuộc 1 lớp cụ thể nào
 * @author HS
 */
public class CheckClassType {
    public static void main(String[] args) {
        //mảng kiểu Object -> mảng hỗn hợp 
        Object[] objArray = new Object[4];
        objArray[0] = "hello";
        objArray[1] = 1000L;
        objArray[2] = 20;
        objArray[3] = 'c';
        
        for(int i=0; i<objArray.length; i++){
            if(objArray[i] instanceof Integer){
                System.out.println("Kiểu integer: "+objArray[i]);
            }
            else if(objArray[i] instanceof Long){
                System.out.println("Kiểu long: "+objArray[i]);
            }
            else if(objArray[i] instanceof Character){
                System.out.println("Kiểu char: "+objArray[i]);
            }
            else{
                System.out.println("Kiểu khác: "+objArray[i]);
            }
        }
    }
}
