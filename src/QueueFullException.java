/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class QueueFullException extends Exception {
    
    public QueueFullException(int queueSize){
        super("Queue Full: max capacity " +queueSize);
    }
}
