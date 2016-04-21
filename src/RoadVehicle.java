
/**
 *
 * An abstract class RoadVehicle
 */
public abstract class RoadVehicle {
    private String colour;
    private int fuel;

/**
 * 
 * Create a RoadVehicle using Colour 
 */    
    public RoadVehicle(String colour){
        this.colour = colour;
    }

/**
 * 
 * return the colour
 */    
    public String getColour(){
        return colour;
    }

/**
 * 
 * Change the colour to new Colour
 */    
    public void setColour(String colour){
        this.colour = colour;
    }

/**
 * 
 * Return the fuel amount 
 */    
    public int getFuel(){
        return fuel;
    }

/**
 * 
 * Add fuel to the vehicle
 */    
    public void addFuel(int addFuel){
        fuel += addFuel;
    }
/**
 * 
 * Reduce the fuel in the vehicle
 */    
    public void useFuel(int useFuel){
        fuel -= useFuel;
    }

/**
 * 
 * Return the colour
 */    
    public String toString(){
        return colour;
    }
    
    public abstract String getLetter();
        
    

}
