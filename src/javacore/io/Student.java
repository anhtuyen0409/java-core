
package javacore.io;

import java.io.Serializable;

/**
 * giới thiệu đọc ghi Object vài file trong java sử dụng ObjectInputStream/ObjectOutputStream
 * Interface Serializable không có phương thức 
 * @author HS
 */
public class Student implements Serializable{
    private static final long serialVersID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;
    
    public void Student(){}
    
    public Student(int id, String name, String address, int age){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){
        return "StudentID: " + id + ", Name: " + name + ", Address: " + address + ", Age: " + age;
    }
}
