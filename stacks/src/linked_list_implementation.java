//this is the stack implementation in terms of linked list
public class linked_list_implementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

        @Override
        public String toString() {
            return " " + this.data;

        }
    }

    static class Stack {
        Node head = null;

        // METHODS OF THE STACK
        /*
        PUSH, POP, PEEK, SIZE, ISEMPTY.
         */

        //DISPLAY
        public void display() {

            Node temp = head;
            while (temp != null) {
                System.out.print("-> " + temp.data);
                temp = temp.next;

            }
            System.out.println("\n");
        }

        //PUSH
        public void push(int element) {
            Node new_node = new Node(element);
            if (head == null) {
                head = new_node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
            }
        }

        //POP
        public int pop() {
            int data = 0;
            if (head == null) {
                System.out.print("Empty Stack :");
                return -1;

            } else if (head.next == null) {
                data = head.data;
                head = null;
                return data;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                data = temp.next.data;
                temp.next = null;
            }
            return data;
        }

        // PEEK
        public int peek() {
            int data = 0;
            if (head == null) {
                System.out.print("Empty Stack :");
                return -1;

            }
            if (head.next == null) {
                return head.data;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                data = temp.data;
            }
            return data;
        }

        // ISEMPTY
        public boolean Is_empty() {
            if (head == null) {
                return true;
            } else return false;
        }

        //SIZE
        public int size() {
            int size = 1;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                size++;
            }
            return size;
        }
    }

    public static void main(String[] args) {

        Stack stack_int = new Stack();
        stack_int.push(10);
        stack_int.push(20);
        stack_int.push(30);
        stack_int.display();
        System.out.println(stack_int.peek());
        System.out.println(stack_int.pop());
        System.out.println(stack_int.size());
        System.out.println(stack_int.Is_empty());

        System.out.println("By Hush!");
    }
}
