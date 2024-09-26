public class Main {
    public static void main(String[] args) {

        int errorCount = 0;
        int warnCount = 0;
        int warnMemCount = 0;
        int infoCount = 0;

        Queue<String> queue = new Queue<>();
        Stack<String> stack = new Stack<>();

        while(!StdIn.isEmpty()){
            LogNode<String> newNode = new LogNode<>(StdIn.readLine());
            queue.enqueue(newNode.data);
        }

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

        System.out.println("\nAssignment 1 - Luke Stanford & Camryn McPhaul\n");

        System.out.println("Last 100 errors: ");
        for(int i = 0; i < 100; i++){
            stack.print();
        }

        System.out.println("\nCSV Analysis: ");
        System.out.println("Error count: " + errorCount);
        System.out.println("All Warnings log count: " + warnCount);
        System.out.println("Memory Warnings log count: " + warnMemCount);
        System.out.println("Info log count: " + infoCount + "\n");
    }
}
