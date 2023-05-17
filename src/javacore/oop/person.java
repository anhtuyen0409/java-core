
package javacore.oop;

/**
 * class mô tả thông tin person
 * @author HS
 */
public class person {
    private String name;
    private int age;
    
    public person(String name){
        this.name = name;
    }
    
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
}
