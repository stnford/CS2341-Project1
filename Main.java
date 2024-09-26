public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        while(!StdIn.isEmpty()){
            LogNode<String> newNode = new LogNode<String>(StdIn.readLine());
            queue.enqueue(newNode.data);
        }

        queue.printQueue();

        while (!queue.isEmpty()) {
            String item = queue.dequeue(); // dequeue needs to be fixed
            if(item != null && item.contains("ERROR")){
                stack.push(item);
                errorCount++;
            }
            else if (item!= null && item.contains("WARN")){
                warnCount++;
                if(item.contains("Memory")){
                    warnMemCount++;
                }
            }
            else if(item!= null && item.contains("INFO")){
                infoCount++;
            }
        }

        System.out.println("CSV Analysis: ");
        System.out.println("Error count: " + errorCount);
        System.out.println("All Warnings log count: " + warnCount);
        System.out.println("Memory Warnings log count: " + warnMemCount);
        System.out.println("Info log count: " + infoCount);

    }
}
