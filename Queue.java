/*
Queue is first in first out so this class will need a front pointer and a rear pointer
to add (enqueue) to the rear and remove (dequeue) from the front
 */
public class Queue {
    private LogNode front;
    private LogNode rear;

    //set front and rear to null to create an empty queue.
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //Enqueue to add logs to the rear
    public void enqueue(LogNode logEntry){

        //create new logNode with the data from the logEntry
        LogNode newLog = new LogNode(logEntry.data);

        //if the queue is empty set the legNode to the first and last position
        if(this.front == null){
            this.front = newLog;
            this.rear = newLog;
            return;
        }
        else{ //if the queue is not empty add the newLog to the end of the queue
            this.rear.next = newLog;    //.next to save its position at the end of the queue
            this.rear = newLog;     //.rear to actually set it as the rear
        }

    }

    public void dequeue(){
        if(this.front == null){
            System.out.println("Queue is empty");
        }
        else{

        }
    }

    public void printLast(){
        if(this.front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(rear.data);
        }
    }

    public void printQueue(){
        if(this.front == null){
            System.out.println("Queue is empty");
        }
        else{
            LogNode current = front;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }


}
