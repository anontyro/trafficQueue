

/**
 *
 * A simple Car subclass of RoadVehicles superclass
 */
public class Car extends RoadVehicle {
    private String make;

/**
 * 
 * Creates a car with colour and make 
 */    
    public Car(String colour, String make){
        super(colour);
        this.make = make;
    }

/**
 * 
 * Returns the make 
 */    
    public String getMake(){
        return make;
    }
    
/**
 * 
 * Creates a string of colour and make 
 */
    public String toString(){
       return super.toString() + " " + make;
    }
    
    public String getLetter(){
        return "C";
    }
  
}
