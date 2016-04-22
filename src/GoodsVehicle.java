
/**
 *
 * A subclass GoodsVehicle that extends superclass RoadVehicle
 */
public class GoodsVehicle extends RoadVehicle {
    private String type;
    private int weight;

/**
 * 
 * Create a Goods Vehicle taking Colour, weight (KG), and type
 */    
    public GoodsVehicle(String colour, int weight, String type){
        super(colour);
        this.type = type;
        this.weight = weight;
    }

/**
 * 
 * Return the weight in KG
 */    
    public int getWeight(){
        return weight;
    }
    
/**
 * 
 * Return a String reading: Colour + Type + Max Weight = + weight KG
    */
    public String toString(){
        return super.toString() + " " + type + ", Max weight = " 
                + weight +" Kg";
    }
/**
 * 
 * returns the first letter of a goods vehicle from its type
 */    
    public String getLetter(){
        char letter = this.type.charAt(0);
        String getLetter = Character.toString(letter);


        return getLetter;
    }
}
