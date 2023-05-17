
package javacore.variable;

/**
 * class này giới thiệu về biến instance trong java
 * @author HS
 */
public class InstanceVariable {
    public String name;
    public int age;
    public InstanceVariable(){
        
    }
    public InstanceVariable(String name){
        this.name = name;
    }
    public InstanceVariable(int age){
        this.age = age;
    }
    public InstanceVariable(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
    /**
     * method main
     */
    public static void main(String[] args) {
        InstanceVariable object1 = new InstanceVariable();
        object1.show();
        InstanceVariable object2 = new InstanceVariable("Tuyên");
        object2.show();
        InstanceVariable object3 = new InstanceVariable(20);
        object3.show();
        InstanceVariable object4 = new InstanceVariable("Tuyên",20);
        object4.show();
    }
}
