
package javacore.io.entity;

/**
 *
 * @author HS
 */
//Comparable<Employee> là interface cho phép so sánh các đối tượng trong class Employee
public abstract class Employee implements Comparable<Employee>{
    
    private String fullName; //tên
    private float salaryRatio; //hệ số lương
    private float allowance; //phụ cấp
    private float salary;
    
    public void setSalary(float salary){
        this.salary = salary;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public float getSalaryRatio(){
        return this.salaryRatio;
    }
    
    public void setSalaryRatio(float salaryRatio){
        this.salaryRatio = salaryRatio;
    }
    
    public float getAllowance(){
        return this.allowance;
    }
    
    public void setAllowance(float allowance){
        this.allowance = allowance;
    }
    
    public abstract float getSalary();
    
    @Override
    public int compareTo(Employee emp){
        return this.fullName.compareTo(emp.fullName);
    }
}
