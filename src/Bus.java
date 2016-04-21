/**
 * 
 * A simple class that creates a Bus subclass from RoadVehicle superclas
 */
public class Bus extends RoadVehicle {
    private int numSeats;
    
/**
* 
* Creates a Bus taking colour and number of Seats
*/
    
    public Bus(String colour, int numSeats){
        super(colour);
        this.numSeats = numSeats;
    }

/**
 * 
 * Returns the number of seats the bus has 
 */    
    public int getSeats(){
        return numSeats;
    }
    
/**
 * 
 * Returns a string that reads Colour + bus with + number of seats 
 */
    public String toString(){
        return super.toString() + " bus with " + numSeats +" seats";
    }
    
    public String getLetter(){
        return "B";
    }
}
