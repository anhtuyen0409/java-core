
package javacore.oop.Assignment.business;

import java.util.ArrayList;
import java.util.Random;
import javacore.oop.Assignment.entity.Bee;
import javacore.oop.Assignment.entity.Drone;
import javacore.oop.Assignment.entity.QeenBee;
import javacore.oop.Assignment.entity.WorkerBee;

/**
 * class này để xử lý logic: tạo danh sách bee, attack bee
 * @author HS
 */
public class BeeHive {
    private ArrayList<Bee> listBee;
    
    public void init(){
        //create list of 10 bee of Drone, Queen and Worker types
        //in each bee, type and health attributes are randomly chosen
        this.listBee = new ArrayList<>();
        
        //add mỗi kiểu bee 1 con đầu tiên và add vào list để đảm bảo trong list có đầy đủ các loại bee
        this.listBee.add(new Drone());
        this.listBee.add(new QeenBee());
        this.listBee.add(new WorkerBee());
        
        //tạo random 7 con còn lại của 3 kiểu bee
        //tạo 1 số random từ 1 đến 3
        Random rand = new Random();
        
        for(int i=0; i<7; i++){
            int r = rand.nextInt(3) + 1;
            
            if(r == 1){
                //add Drone
                this.listBee.add(new Drone());
            }
            else if(r == 2){
                //add QueenBee
                this.listBee.add(new QeenBee());
            }
            
            else{
                //add WorkerBee
                this.listBee.add(new WorkerBee());
            }
        }
    }
    
    public ArrayList<Bee> getAllBees(){
        return listBee;
    }
    
    //attack all bees
    public void attackBees(){
        
        //duyệt toàn bộ danh sách Bee trong mảng để thực hiện damage
        for(int i=0; i<getAllBees().size(); i++){
            getAllBees().get(i).damage();
        }
    }
}
