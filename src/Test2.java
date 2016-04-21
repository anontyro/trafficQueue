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
        SimulationFrame f = new SimulationFrame(500,400,q);
        f.setVisible(true);
    }
    
}
