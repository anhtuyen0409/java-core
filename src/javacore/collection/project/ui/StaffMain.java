
package javacore.collection.project.ui;


import java.util.ArrayList;
import java.util.Scanner;
import javacore.collection.project.business.AllowanceCalulator;
import javacore.collection.project.business.EmployeeManagement;
import javacore.collection.project.entity.EDegree;
import javacore.collection.project.entity.EPosition;
import javacore.collection.project.entity.Employee;
import javacore.collection.project.entity.Staff;
import javacore.collection.project.entity.Teacher;

/**
 *
 * @author HS
 */
public class StaffMain {
    
    public static void main(String[] args) {
        //create employee management object
        EmployeeManagement empMan = new EmployeeManagement();
        
        //menu
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        while(keepRunning){
            System.out.println("University staff management 1.0");
            System.out.println("\t1.Add staff/teacher");
            System.out.println("\t2.Search staff/teacher by name");
            System.out.println("\t3.Search staff/teacher by department/faculty");
            System.out.println("\t4.Display all staff/teacher");
            System.out.println("\t5.Exit");
            System.out.println("Select function (1, 2, 3, 4 or 5): ");
            int choice = sc.nextInt();
            switch(choice){
                //add staff/teacher
                case 1:{
                    Employee emp = createNewImployee();
                    float allowance = AllowanceCalulator.calculateAllowance(emp);
                    emp.setAllowance(allowance);
                    empMan.addEmployee(emp);
                    break;
                }
                
                //search by name
                case 2:{
                    System.out.print("\tEnter name to search: ");
                    sc = new Scanner(System.in); //phải có dòng này mới cho nhập tên
                    String name = sc.nextLine();
                    ArrayList<Employee> foundByName = empMan.searchByName(name);
                    display(foundByName);
                    break;
                }
                
                //search by department
                case 3:{
                    System.out.print("\tEnter department/faculty to search: ");
                    sc = new Scanner(System.in);
                    String depart = sc.nextLine();
                    ArrayList<Employee> foundByDepart = empMan.searchByDepart(depart);
                    display(foundByDepart);
                    break;
                }
                
                //display all
                case 4:{
                    ArrayList<Employee> listE = empMan.listAll();
                    display(listE);
                    break;
                }
                
                //exit
                case 5:{
                    keepRunning = false;
                }
            }
        }
    }
    
    //create an employee by inputing it's attribute values from keyboard
    static Employee createNewImployee(){
        
        System.out.println("Do you want to create a staff or a teacher (enter s for staff, otherwise for teacher)?");
        //accept Staff or Teacher details from keyboard
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("s")){
            Staff s = new Staff();
            
            //nhập thông tin nhân viên từ bàn phím
            System.out.println("Staff name: ");
            String fullName = sc.nextLine();
            
            System.out.println("Staff department: ");
            String department = sc.nextLine();
            
            System.out.println("Staff position (1-HEAD, 2-VICE HEAD, 3-STAFF): ");
            int position = sc.nextInt();
            
            System.out.println("No of working day: ");
            float noOfWorkingDay = sc.nextFloat();
            
            System.out.println("Salary ratio: ");
            float salaryRatio = sc.nextFloat();
            
            //set thông tin cho nhân viên
            s.setFullName(fullName);
            s.setDepartment(department);
            s.setNoOfWorkingDay(noOfWorkingDay);
            s.setSalaryRatio(salaryRatio);
            
            if(position == 1){
                s.setPosition(EPosition.HEAD);
            }
            else if(position == 2){
                s.setPosition(EPosition.VICE_HEAD);
            }
            else if(position == 3){
                s.setPosition(EPosition.STAFF);
            }
            return s;
        }
        else{
            Teacher t = new Teacher();
            
            System.out.println("Teacher name: ");
            String fullName = sc.nextLine();
            
            System.out.println("Teacher faculty: ");
            String faculty = sc.nextLine();
            
            System.out.println("Staff degree (1-DOCTOR, 2-MASTER, 3-BACHELOR)?");
            int degree = sc.nextInt();
            
            System.out.println("Teaching hours: ");
            int teachingHours = sc.nextInt();
            
            System.out.println("Salary ratio: ");
            float salaryRation = sc.nextFloat();
            
            //set thông tin cho giảng viên
            t.setFullName(fullName);
            t.setFaculty(faculty);
            t.setTeachingHours(teachingHours);
            t.setSalaryRatio(salaryRation);
            
            if(degree == 1){
                t.setDegree(EDegree.DOCTOR);
            }
            else if(degree == 2){
                t.setDegree(EDegree.MASTER);
            }
            else if(degree == 3){
                t.setDegree(EDegree.BACHELOR);
            }
            return t;
        }
    }
    
    //display a list of employee
    static void display(ArrayList<Employee> listE){
        System.out.println("Result:");
        System.out.println("Name, Faculty/Department, Degree/Position, Salary ratio, Allowance, Teaching hours/No of working day, Salary");
        for(Employee e : listE){
            System.out.println(e);
        }
    }
}
