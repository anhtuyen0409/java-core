
package javacore.io.business;

import javacore.io.entity.EDegree;
import javacore.io.entity.EPosition;
import javacore.io.entity.Employee;
import javacore.io.entity.Staff;
import javacore.io.entity.Teacher;

/**
 * class tính phụ cấp theo từng chức vụ cho Staff/Teacher
 * @author HS
 */
public class AllowanceCalulator {
    
    public static float calculateAllowance(Employee emp){
        
        float allowance = 0;
        
        if(emp instanceof Staff){
            Staff s = (Staff)emp;
            //head-trưởng phòng 2000
            if(s.getPosition() == EPosition.HEAD){
                allowance = 2000;
            }
            //vice-head/phó phòng 1000
            else if(s.getPosition() == EPosition.VICE_HEAD){
                allowance = 1000;
            }
            //staff-nhân viên 500
            else if(s.getPosition() == EPosition.STAFF){
                allowance = 500;
            }
        }
        
        else if(emp instanceof Teacher){
            Teacher t = (Teacher)emp;
            //Doctor-tiến sĩ 1000
            if(t.getDegree() == EDegree.DOCTOR){
                allowance = 1000;
            }
            //Master-thạc sĩ 500
            else if(t.getDegree() == EDegree.MASTER){
                allowance = 500;
            }
            //Bachelor-cử nhân 300
            else if(t.getDegree() == EDegree.BACHELOR){
                allowance = 300;
            }
        }
        return allowance;
    }
}
