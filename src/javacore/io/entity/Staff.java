
package javacore.io.entity;

/**
 *
 * @author HS
 */
public class Staff extends Employee{
    
    private String department; //phòng ban
    private float noOfWorkingDay; //số ngày làm việc
    private EPosition position; //chức vụ (trưởng phòng/phó phòng/nhân viên)
    
    public Staff(){
        
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    public String getDepartment(){
        return this.department;
    }
    
    public void setNoOfWorkingDay(float noOfWorkingDay){
        this.noOfWorkingDay = noOfWorkingDay;
    }
    
    public float getNoOfWorkingDay(){
        return this.noOfWorkingDay;
    }
    
    public void setPosition(EPosition position){
        this.position = position;
    }
    
    public EPosition getPosition(){
        return this.position;
    }
    
    @Override
    public float getSalary(){
        float sal;
        sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.noOfWorkingDay * 30;
        return sal;
    }
    
    @Override
    public String toString(){
        return this.getFullName() + ", " + this.getDepartment() + ", " + this.getPosition() + ", " + 
                this.getSalaryRatio() + ", " + this.getAllowance() + ", " + ", " + this.getNoOfWorkingDay() + ", " + this.getSalary();
    }
}
