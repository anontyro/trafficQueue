/**
 *Testing class
 */
import java.util.Random;
import simplesim.*;


public class Test {
    public static void main(String[]args){
        try{
        
        Random random = new Random();
        
        Car car1 = new Car("orange","VW");
        Car car2 = new Car("lime", "Dodge");
        
        Bus bus1 = new Bus("yellow",100);
        Bus bus2 = new Bus("neon pink", 300);
        
        GoodsVehicle van = new GoodsVehicle("purple",200,"Van");
        GoodsVehicle lorry = new GoodsVehicle("black", 1000, "Lorry");
        
        FireEngine fireEngine1 = new FireEngine();
        FireEngine fireEngine2 = new FireEngine("Green");
        fireEngine2.setCodeBlue(true);
        
        TrafficQueue queue1 = new TrafficQueue(20);
        
        RoadVehicle[] someVehicles ={car1,car2,bus1,bus2,van,lorry,fireEngine1,
        fireEngine2};
        
        for(int i = 0; i < 20; i++){
            int randomVehicle = random.nextInt(8);
            queue1.add(someVehicles[randomVehicle]);
        }
        
        
        System.out.println(queue1.toString());
        
        FireEngine engine1 = new FireEngine();
        FireEngine engine2 = new FireEngine();
        System.out.println(engine1.toString());
        System.out.println(engine2.toString());
        
        engine2.setCodeBlue(true);
        System.out.println(engine2);
        
        System.out.println(queue1.getMaxCapacity());
        

       
                }
        
        catch(ArrayIndexOutOfBoundsException queueFull){
            System.out.println("Queue is full");
        }
        
        catch(RuntimeException emptyQueue){
            System.out.println(emptyQueue.toString());
        }
        catch(QueueFullException full){            
            System.out.println(full.toString());
        }

        
        finally{
            System.out.println("Execution complete");
        
    }
        

    }
}
