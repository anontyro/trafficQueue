/**
 * A simple class that creates an Array object to represent a traffic queue,
 * this will then accept Car objects at indexes
 * 
 */
import java.awt.Color;
import simplesim.*;
import java.awt.Graphics;
import java.util.*;


public class TrafficQueue implements ThingBeingSimulated {
    
    private ArrayList<RoadVehicle>vehicleQueue;
    private int vehiclesInQueue = 0;
    private int queueSize = 0;
    private int maxX = 0;
    private int maxY = 0;
    private String summary = " ";
    private String printLetter = " ";

    
 
/**
 * 
 * Creates a new TrafficQueue with a specific queue length 
 */    
    public TrafficQueue(int queueSize){
       vehicleQueue = new ArrayList<RoadVehicle>(queueSize); 
       this.queueSize = queueSize;

    }

/**
 * 
 * Add a car into the queue with car object and array index
 */    
    public void add(RoadVehicle vehicle, int index){
        vehicleQueue.add(index, vehicle);
        vehiclesInQueue++;
    }

/**
 * 
 * Add a car into the queue with car object, normal cars will be added to the
 * end of the queue
 * If an Emergency Vehicle is added with CodeBlue at True will move to the front
 */    
    public void add(RoadVehicle vehicle) throws QueueFullException{       
        
        if(isFull()){
            throw (new QueueFullException(queueSize));
        }
        
        if(vehicle instanceof EmergencyVehicle ){
            EmergencyVehicle emV;
            emV = (EmergencyVehicle) vehicle;
            
            if(((EmergencyVehicle) vehicle).getCodeBlue() == true){
               addToFront(vehicle);
            }else{
                addToBack(vehicle);
            }                         
    }else{
            addToBack(vehicle);
        }
        
    }
    private void addToBack(RoadVehicle vehicle){
        vehicleQueue.add(vehicle);
        vehiclesInQueue++;
    }
    
    private void addToFront(RoadVehicle vehicle){
        vehicleQueue.add(0, vehicle);       
        vehiclesInQueue++;
    }

/**
 * 
 * returns the number of cars in the current queue
 */    
    public int getVehiclesInQueue(){
        
        return vehiclesInQueue;
    }
/**
 * 
 * Returns the total size of the current queue 
 */    
    public int getMaxCapacity(){
        return queueSize;
    }

/**
 * 
 * Returns a boolean asking if the queue is empty, true = empty
 */    
    public boolean isEmpty(){
        return vehicleQueue.isEmpty();
    }
/**
 * 
 * Returns a boolean asking if the queue is full, true =full
 */    
    public boolean isFull(){
        return vehiclesInQueue == queueSize;
    }
/**
 * 
 * Returns a String reading "There are +carsInQueue + cars in the Queue,
 * they are:"
 * It will then print out the cars in queue showing the make, colour and fuel
 * of each car on separate lines
 */    
    public String toString(){

        return "Traffic Queue Simulation";
                //"There are " +vehiclesInQueue + " cars in the Queue,"
                  //  + "they are:" +"\n" + vehicleQueue.toString();
    }
/**
 * 
 * Return the car which has been removed from the front of the traffic queue
 * cycles all remaining cars up the queue to the start
 * if the queue is empty print "error, queue is already empty" System.exit(1)
 */    
    public RoadVehicle remove(){
       RoadVehicle vehicleRemove = vehicleQueue.get(0);
        if(vehiclesInQueue == 0){
            throw new RuntimeException("Removing from empty queue");
        }
        else{

            vehicleQueue.remove(0);
        }
        vehiclesInQueue--;
        return vehicleRemove;
    }

    
    public ThingBeingSimulated reset(){
        
        return new TrafficQueue(queueSize) ;
    }
    
    public void simstep() throws SimulationException{
        
        
       Random random = new Random();
        
        Car car1 = new Car("Yellow", "BMW");
        Car car2 = new Car("Black", "Ford");
        
        Bus bus1 = new Bus("Red", 200);
        Bus bus2 = new Bus("Green", 350);
        
        GoodsVehicle van = new GoodsVehicle("Pink",400,"Van");
        GoodsVehicle lorry = new GoodsVehicle("Orange",100,"lorry");
        
        FireEngine fireEngine1 = new FireEngine();
        FireEngine fireEngine2 = new FireEngine("Black");
        fireEngine2.setCodeBlue(true);
        
        RoadVehicle[] vehicleList ={car1,car2,bus1,bus2,van,lorry,fireEngine1,
            fireEngine2};
        

        
        try{
            if(this.isFull()){
                summary = " ";
                String newVehicle = " ";
                int ranVehicle = random.nextInt(8);
                this.remove();
                this.add(vehicleList[ranVehicle]);
                newVehicle = vehicleList[ranVehicle].getLetter();
                
                for(int i = 0; i < queueSize; i++){
                    summary += vehicleQueue.get(i).getLetter();                                       
                }
                
                summary += "\n" + 
                        " The last vehicle added was: " + newVehicle ;
                System.out.println(summary);
                
                                
            }
            
            
                int ranVehicle = random.nextInt(8);
                this.add(vehicleList[ranVehicle]);
                printLetter += vehicleList[ranVehicle].getLetter();

            System.out.println(printLetter);
            
        }

        catch(QueueFullException full){
           throw new SimulationException("List contains: " +vehiclesInQueue+
                   " vehicles max capacity is: "+queueSize + 
                   "First vehicle has been release and new one joins");                    
            
        }

        
    }
    
    public void setBounds(int maxX, int maxY){        
        this.maxX = maxX;
        this.maxY = maxY;
    }
    
    public void display(Graphics g){
        
        g.drawString(printLetter, 100, 150);
        g.drawString(summary, 100, 175);
        
    }
    
    public String getLetter(RoadVehicle vehicle){
        return vehicle.getLetter();
    }
    
    

      
}


