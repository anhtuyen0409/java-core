
package javacore.io.entity;

import javacore.io.business.AllowanceCalulator;

/**
 *
 * @author HS
 */
public class Teacher extends Employee{
    
    private String faculty; //khoa
    private EDegree degree; //trình độ (tiến sĩ/thạc sĩ/cử nhân)
    private int teachingHours; //số giờ dạy
    
    public Teacher(){
        float allowance = AllowanceCalulator.calculateAllowance(this);
        this.setAllowance(allowance);
    }
    
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    public String getFaculty(){
        return this.faculty;
    }
    
    public void setDegree(EDegree degree){
        this.degree = degree;
    }
    
    public EDegree getDegree(){
        return this.degree;
    }
    
    public void setTeachingHours(int teachingHours){
        this.teachingHours = teachingHours;
    }
    
    public int getTeachingHours(){
        return this.teachingHours;
    }
    
    @Override
    public float getSalary(){
        float sal;
        sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.teachingHours * 45;
        return sal;
    }
    
    @Override
    public String toString(){
        return this.getFullName() + ", " + this.getFaculty() + ", " + this.getDegree() + ", " + 
                this.getSalaryRatio() + ", " + this.getAllowance() + ", " + this.getTeachingHours() + ", " + this.getSalary();
    }
}
