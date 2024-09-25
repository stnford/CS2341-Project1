
    public class Stack<Type> {
        private Node first, last;

        private class Node {
            Type item;
            Node next;
        }

        // Constructor
        public Stack() {
            first = null;
            last = null;
        }

        public boolean isEmpty() {
            return first == null;
        }

        // adds an item to the front
        public void push(Type item) {
            if (isEmpty()) {

                last = new Node();
                last.item = item;
                last.next = null;
                first = last;
            } else {
                Node oldFirst = first;
                first = new Node();
                first.item = item;
                first.next = oldFirst;
            }
        }

        // removes item from the front
        public Type pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return null;
            }
            Type item = first.item;
            first = first.next;

            if (isEmpty()) {
                last = null; // Reset last if the list becomes empty
            }
            return item;
        }
        public void printStack() {
            Node current = first;
            while (current != null) {
                System.out.print(current.item + " ");
                current = current.next; // goes to the next node
            }
            System.out.println();
        }
    }

