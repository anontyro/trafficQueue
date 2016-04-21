
/**
 *
 * EmergencyVehicle is an abstract subclass of RoadVehicle 
 */
public abstract class EmergencyVehicle extends RoadVehicle {
    
    private boolean codeBlue = false;

/**
 * 
 *  Creates an EmergencyVehicle from the colour
 */    
    public EmergencyVehicle(String colour){
        super(colour);
    }
/**
 * 
 * returns boolean for Code Blue  
 */    
    public boolean getCodeBlue(){
        return codeBlue;
    }
/**
 * 
 * Change the status of boolean Code Blue 
 */    
    public void setCodeBlue(boolean codeBlue){
        this.codeBlue = codeBlue;
    }
}
