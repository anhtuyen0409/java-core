
package javacore.io.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javacore.io.entity.EDegree;
import javacore.io.entity.EPosition;
import javacore.io.entity.Employee;
import javacore.io.entity.Staff;
import javacore.io.entity.Teacher;
import javacore.io.exception.MyValidateException;

/**
 *
 * @author HS
 */
public class EmployeeManagement {
    
    public static final String FILE_NAME = "src/javacore/io/data.txt";
    public static final String NEW_LINE = "\n";
    public static final String EMP_TEACHER = "Teacher";
    public static final String EMP_STAFF = "Staff";
    
    //store all Staff/Teacher
    private ArrayList<Employee> listE;
    
    public EmployeeManagement() throws IOException,Exception{
        listE = new ArrayList<>();
        
        //load data from data.txt to listE
        this.load(FILE_NAME);
    }
    
    public void addEmployee(Employee emp) throws IOException, Exception{
        //save to file
        save(emp,FILE_NAME);
        
        //add to listE
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
    /**
     * load data from data.txt
     * MyValidateException là Exception do tui tự định nghĩa, phải có khai báo 1 class riêng cho nó
     * hàm load có chức năng đọc nội dung file data.txt sau đó thêm vào trong listE
     * @param fileName
     */
    public void load(String fileName) throws MyValidateException, Exception{
        
        BufferedReader br = null;
        FileReader fr = null;
        String sCurrentLine = null;
        
        try {
            
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            
            String[] words;
            while((sCurrentLine = br.readLine()) != null){
                words = sCurrentLine.split(","); //tách chuỗi dựa trên ","
                
                //mỗi Object có 8 cột thông tin => mảng words có 8 phần tử
                if(words.length != 8){
                    throw new MyValidateException("Wrong data format at line: " + sCurrentLine);
                }
                
                if(EMP_STAFF.equals(words[0].trim())){
                    //khởi tạo Staff
                    //format Staff: Staff, fullname, department, position, salaryRatio, allowance, noOfWorkingDay, salary
                    Staff s = new Staff();
                    s.setFullName(words[1].trim());
                    s.setDepartment(words[2].trim());
                    s.setPosition(EPosition.valueOf(words[3].trim()));
                    s.setSalaryRatio(Float.parseFloat(words[4].trim()));
                    s.setAllowance(Float.parseFloat(words[5].trim()));
                    s.setNoOfWorkingDay(Float.parseFloat(words[6].trim()));
                    s.setSalary(Float.parseFloat(words[7].trim()));
                    //add to list
                    this.listE.add(s);
                }
                
                else if(EMP_TEACHER.equals(words[0].trim())){
                    //tạo teacher
                    //format teacher (Teacher,fullname,faculty,degree,salaryratio,allowance,teachinghours,salary)
                    Teacher t = new Teacher();
                    t.setFullName(words[1].trim());
                    t.setFaculty(words[2].trim());
                    t.setDegree(EDegree.valueOf(words[3].trim()));
                    t.setSalaryRatio(Float.parseFloat(words[4].trim()));
                    t.setAllowance(Float.parseFloat(words[5].trim()));
                    t.setTeachingHours(Integer.parseInt(words[6].trim()));
                    t.setSalary(Float.parseFloat(words[7].trim()));
                    //add to list
                    this.listE.add(t);
                }
            }
        } catch (IOException e) {
            throw new Exception("Can not read data.txt, please check again!");
        } catch (NumberFormatException e){
            throw new MyValidateException("Wrong input data, can not convert to number from character input at line: " + sCurrentLine);
        } finally{
            //close
            if(br != null){
                br.close();
            }
            if(fr != null){
                fr.close();
            }
        }
    }
    
    /**
     * hàm save có chức năng ghi data
     * @param emp
     * @param fileName
     * @throws IOException
     * @throws Exception 
     */
    public void save(Employee emp,String fileName) throws IOException,Exception{
        //format ghi nội dung ra file như sau:
        //Staff,fullname,department,position,salaryratio,allowance,noofwokingday,salary
        //Teacher,fullname,faculty,degree,salaryratio,allowance,teachinghours,salary
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            String data = emp.toString();
            
            if(emp instanceof Staff){
                data = EMP_STAFF + "," + data;
            }else if(emp instanceof Teacher){
                data = EMP_TEACHER + "," + data;
            }
            
            //check data before add new line
            if(listE.size() > 0){
                data = NEW_LINE + "" + data;
            }
            
            File file = new File(fileName);
            
            //true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            
            //write data
            bw.write(data);
            
        } catch (Exception e) {
            throw new Exception("Can not save data to data.txt, please check again!");
        } finally{
            if(bw != null){
                bw.close();
            }
            if(fw != null){
                fw.close();
            }
        }
    }
}
