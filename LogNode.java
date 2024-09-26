/*
Since the project uses linked list form this class will be called to create a node for each log entry
 */
public class LogNode<T> {
    T data;
    LogNode next;

    public LogNode(T data){
        this.data = data;
        this.next = null;
    }
}
