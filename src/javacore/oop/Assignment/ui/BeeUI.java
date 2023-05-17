
package javacore.oop.Assignment.ui;

import java.util.ArrayList;
import java.util.Scanner;
import javacore.oop.Assignment.business.BeeHive;
import javacore.oop.Assignment.entity.Bee;



/**
 * class này tạo UI cho người dùng
 * @author HS
 */
public class BeeUI {
    public static void main(String[] args) {
        
        BeeHive bh = null;
        boolean keepRunning = true;
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while(keepRunning){
            //menu
            System.out.println("------------- Beehive -------------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack bees");
            System.out.println("\t3 - Exit");
            System.out.println("Enter your choice (1, 2 or 3): ");
            choice = sc.nextInt();
            ArrayList<Bee> bees;
            switch(choice){
                case 1:{
                    bh = new BeeHive();
                    bh.init(); //create 10 bees
                    bees = bh.getAllBees();
                    System.out.println("Bees details at the beginning:");
                    showBees(bees);
                    break;
                }
                
                case 2:{
                    if(bh == null){
                        System.out.println("No bee!");
                    }
                    else{
                        bh.attackBees(); //attack bees
                        bees = bh.getAllBees();
                        System.out.println("Bees details at the moment:");
                        showBees(bees);
                    }
                    break;
                }
                
                case 3:{
                    keepRunning = false;
                    break;
                }
                
                default:{
                    System.out.println("There is not this choice in the application! Please choice again!");
                    break;
                }
            }
        }
        
        //close
        sc.close();   
    }
    
    public static void showBees(ArrayList<Bee> bees){
        for(int i=0; i<bees.size(); i++){
            //show bees information
            System.out.println(bees.get(i));
        }
    }
}
