
package javacore.oop.Assignment.entity;

import java.util.Random;

/**
 *
 * @author HS
 */
public abstract class Bee {
    private String type;
    private int health;
    private boolean alive;
    
    public Bee(){
        //khởi tạo giá trị ban đầu mỗi khi đối tượng Bee tạo ra
        //mặc định health = 100 và alive = true
        this.health = 100;
        this.alive = true; //mặc định là còn sống
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setHealth(int health){
        this.health = health;
        
        //update status
        this.updateStatus();
    }
    
    public int getHealth(){
        return this.health;
    }
    
    //mặc định ong còn sống
    public boolean isAlive(){
        return this.alive;
    }
    
    protected void updateStatus(){
        //update the alive status when the health value changed
        if("QeenBee".equals(this.type)){
            if(getHealth() < 20){
                //update status is die
                this.alive = false;
            }
        }
        
        else if("Drone".equals(this.type)){
            if(getHealth() < 50){
                this.alive = false;
            }
        }
        
        else if("WorkerBee".equals(this.type)){
            if(getHealth() < 70){
                this.alive = false;
            }
        }
        else{
            //nothing here
        }
    }
    
    //attack this bee
    public void damage(){
        //chỉ damage những con ong còn sống
        if(this.isAlive()){
            
            //tạo 1 số random từ 1 đến 100
            Random rand = new Random();
            int damageAmount = rand.nextInt(100) + 1;
            
            int delta = this.getHealth() - damageAmount;
            if(delta > 0){
                //update
                this.setHealth(delta);
            }
            else{
                //update health to 0
                this.setHealth(0);
            }
        }
    }
    
    //mọi class trong java đều kế thừa từ lớp object
    //trong class object có method toString -> class Bee override lại method toString
    @Override
    public String toString(){
        String beeDetails;
        if("WorkerBee".equals(this.getType()) == true){
            beeDetails = this.getType() + "\t\t"+ this.getHealth() +"\t\t\t"+ (isAlive() == true ? "alive" : "dead");
        }
        else{
            beeDetails = this.getType() + "\t\t\t" + this.getHealth() + "\t\t\t" + (isAlive() == true ? "alive" : "dead");
        }
        
        return beeDetails;
    }
}
