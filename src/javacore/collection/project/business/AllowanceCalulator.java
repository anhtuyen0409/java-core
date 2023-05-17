
package javacore.collection.project.business;

import javacore.collection.project.entity.EDegree;
import javacore.collection.project.entity.EPosition;
import javacore.collection.project.entity.Employee;
import javacore.collection.project.entity.Staff;
import javacore.collection.project.entity.Teacher;

/**
 *
 * @author HS
 */
public class AllowanceCalulator {
    
    public static float calculateAllowance(Employee emp){
        float allowance = 0;
        
        if(emp instanceof Staff){
            Staff s = (Staff) emp;
            //head/trưởng phòng 2000
            if(s.getPosition() == EPosition.HEAD){
                allowance = 2000;
            }
            //vice_head/phó phòng 1000
            else if(s.getPosition() == EPosition.VICE_HEAD){
                allowance = 1000;
            }
            //staff/nhân viên 500
            else if(s.getPosition() == EPosition.STAFF){
                allowance = 500;
            }
        }
        
        else if(emp instanceof Teacher){
            Teacher t = (Teacher) emp;
            if(t.getDegree() == EDegree.DOCTOR){
                allowance = 1000; //tiến sĩ
            }
            else if(t.getDegree() == EDegree.MASTER){
                allowance = 500; //thạc sĩ
            }
            else if(t.getDegree() == EDegree.BACHELOR){
                allowance = 300; //cử nhân
            }
        }
        return allowance;
    }
}
