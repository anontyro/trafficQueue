
/**
 *
 * A class that extends EmergencyVehicles
 */
public class FireEngine extends EmergencyVehicle {
    
/**
 * 
 * Create a Fire Engine object using the colour 
 */    
    public FireEngine(String colour){
        super(colour);
    }
    
/**
 * Create a Fire Engine taking no parameter to make a default red fire engine
 */
    public FireEngine(){
        this("Red");
    }
    
 /**
  * 
  * Create a string which will return Colour + Fire Engine unless Red 
  * If red will not state the colour
  * If the Fire Engine CodeBlue = true will return Fire Engine: CODEBLUE
  */   
    public String toString(){
        
        if(getColour() == "Red"){
            
            if(getCodeBlue() == true){
                return "Fire Engine: CODEBLUE"; 
            }else{
                return "Fire Engine";
            }
        } else{
            
            if(getCodeBlue() == true){
                return getColour() + " Fire Engine: CODEBLUE";
            }else{
                return getColour() + " Fire Engine";
            }
        }
    }
    
    public String getLetter(){
        return "F";
    }
    
}
