public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        while(!StdIn.isEmpty()){
            LogNode newNode = new LogNode(StdIn.readLine());
            queue.enqueue(newNode);
        }

        queue.printQueue();

    }
}