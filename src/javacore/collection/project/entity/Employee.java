
package javacore.collection.project.entity;

/**
 *
 * @author HS
 */
//Comparable<Employee> là interface cho phép so sánh các đối tượng trong class Employee
public abstract class Employee implements Comparable<Employee>{
    
    private String fullName; //tên
    private float salaryRatio; //hệ số lương
    private float allowance; //phụ cấp
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public void setSalaryRatio(float salaryRatio){
        this.salaryRatio = salaryRatio;
    }
    
    public float getSalaryRatio(){
        return this.salaryRatio;
    }
    
    public void setAllowance(float allowance){
        this.allowance = allowance;
    }
    
    public float getAllowance(){
        return this.allowance;
    }
    
    //tại vì chưa biết rõ lương cụ thể của từng thành phần nên để là abstract
    public abstract float getSalary();
    
    @Override
    //override method từ Comparable<Employee>
    public int compareTo(Employee emp){
        //so sánh tên để sắp xếp theo tên
        return this.fullName.compareTo(emp.fullName);
    }
}
