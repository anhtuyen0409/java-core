
package javacore.collection.project.business;

import java.util.ArrayList;
import java.util.Collections;
import javacore.collection.project.entity.Employee;
import javacore.collection.project.entity.Staff;
import javacore.collection.project.entity.Teacher;

/**
 *
 * @author HS
 */
public class EmployeeManagement {
    
    //store all staff/teacher
    private ArrayList<Employee> listE;
    
    public EmployeeManagement(){
        listE = new ArrayList<>();
    }
    
    public void addEmployee(Employee emp){
        listE.add(emp);
    }
    
    //search by staff/teacher's name
    public ArrayList<Employee> searchByName(String name){
        //store all matching staff or teacher
        ArrayList<Employee> empFound = new ArrayList<>();
        
        //check null and empty
        if(name == null || name.trim()==""){
            return empFound;
        }
        
        //duyệt tất cả phần tử mảng để so sánh
        //sử dụng method contains() để kiểm tra sự tồn tại của 1 chuỗi trong chuỗi khác
        for(Employee employee : listE){
            if(employee.getFullName().toUpperCase().contains(name.toUpperCase())){
                empFound.add(employee);
            }
        }
        
        //your code
        return empFound;
    }
    
    //search by staff/teacher's department/faculty
    public ArrayList<Employee> searchByDepart(String depart){
        ArrayList<Employee> empFound = new ArrayList<>();
        
        //duyệt tất cả các phần tử mảng để so sánh
        Staff s = null;
        Teacher t = null;
        String name = null;
        
        for(Employee employee : listE){
            
            if(employee instanceof Staff){
                s = (Staff) employee;
                
                //lấy về phòng ban của staff
                name = s.getDepartment();
            }
            
            else if(employee instanceof Teacher){
                t = (Teacher) employee;
                
                //lấy về khoa của teacher
                name = t.getFaculty();
            }
            
            //check depart name
            if(name.toUpperCase().contains(depart.toUpperCase())){
                empFound.add(employee);
            }
        }
        
        return empFound;
    }
    
    public ArrayList<Employee> listAll(){
        //sort the list of staff/teacher before return
        Collections.sort(listE);
        return listE;
    }
}
