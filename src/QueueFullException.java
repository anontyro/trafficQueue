/**
 * Custom exception class to deal with QueueFullException by printing
 * "Queue Full: max capacity " +queueSize
 */
public class QueueFullException extends Exception {
    
    public QueueFullException(int queueSize){
        super("Queue Full: max capacity " +queueSize);
    }
}
