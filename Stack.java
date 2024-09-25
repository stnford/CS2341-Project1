public class Stack<T> {
    private LogNode<T> top;

    // Constructor
    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;     //isEmpty() will return 'true' if the top is empty.
    }

    // adds an item to the front
    public void push(T item) {
        //EVEN IF the stack is empty we can add our item to the top of the stack
        LogNode<T> newNode = new LogNode<T>(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop(){
        if(top == null){
            return null;    //if the top is empty the whole stack is empty, return null
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void print(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data);
            top = top.next;
        }
    }
}
