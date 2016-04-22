/**
 * Test class that runs a simulationFrame and creates a TrafficQueue of size 20
 */
import simplesim.*;

public class Test2 {
    public static void main(String[]args){
        TrafficQueue q = new TrafficQueue(20);
        SimulationFrame f = new SimulationFrame(500,400,q);
        f.setVisible(true);
    }
    
}
