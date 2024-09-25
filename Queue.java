/*
Queue is first in first out so this class will need a front pointer and a rear pointer
to add (enqueue) to the rear and remove (dequeue) from the front
 */
public class Queue<T> {
    private LogNode<T> front;
    private LogNode<T> rear;

    //set front and rear to null to create an empty queue.
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //Enqueue to add logs to the rear
    public void enqueue(T data){

        //create new logNode with the data from the logEntry
        LogNode<T> newLog = new LogNode<>(data);

        //if the queue is empty set the logNode to the first and last position
        if(this.rear == null && this.front == null){
            this.front = newLog;
            this.rear = newLog;
            return;
        }
        else{ //if the queue is not empty add the newLog to the end of the queue
            this.rear.next = newLog;    //.next to save its position at the end of the queue
            this.rear = newLog;     //.rear to actually set it as the rear
        }
    }

    public T dequeue(){
        //if the queue is empty return null
        if(this.front == null){
            System.out.println("Queue is empty");
            return null;
        }
        else {
            T removal = this.front.data; //if the queue isnt empty get the data from the front node
            this.front = this.front.next; //set the first node to the next node
            if(this.front == null){     //if the queue is now empty set the rear to null
                this.rear = null;
            }
            return removal; //return the removed data
        }
    }

    public boolean isEmpty(){
        return this.front == null;
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
            LogNode<T> current = front;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }


}
