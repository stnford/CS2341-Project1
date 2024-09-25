public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        Stack<String> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            LogNode newNode = new LogNode(StdIn.readLine());
            queue.enqueue(newNode); // Putting logs into the Queue
        }
        queue.printQueue(); // For debugging

        int errorCount = 0;
        int warnCount = 0;
        int warnMemCount = 0;
        int infoCount = 0;

        while (!queue.isEmpty()) {
            LogNode node = queue.dequeue(); // dequeue needs to be fixed
            if(node != null && node.equals("ERROR")){
                stack.push(node);
                errorCount++;
            }
            else if (node!= null && node.equals("WARN")){
                warnCount++;
                if(node.equals("Memory")){
                    warnMemCount++;
                }
            }
            else if(node!= null && node.equals("INFO")){
                infoCount++;
            }
        }

        int popCount = 0 ;
        int maxPops = 100;

        while(!stack.isEmpty() && popCount < maxPops){
           String errorLog = stack.pop();
           System.out.println(errorLog);

           popCount++;

            if(popCount == maxPops){
                System.out.println("Error Stack has reached 100 pops.");
                break;
            }
        }

        System.out.println("INFO: " + infoCount);
        System.out.println("WARN: " + warnCount);
        System.out.println("ERROR: " + errorCount);
        System.out.println("Memory Warnings: " + warnMemCount);

    }
}