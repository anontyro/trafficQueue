/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import simplesim.*;

public class Test2 {
    public static void main(String[]args){
        TrafficQueue q = new TrafficQueue(20);
        
        /*
        try{
        Car car1 = new Car("yellow","Ford");
        for(int i = 0; i < 20; i++){
            q.add(car1);
            System.out.println(q.getLetter(car1));
        }
        }
        catch(QueueFullException a){
            System.out.println("Full");
        }
                */
        SimulationFrame f = new SimulationFrame(500,400,q);
        f.setVisible(true);
    }
    
}
