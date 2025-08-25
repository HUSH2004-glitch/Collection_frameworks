
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class My_linked_list {
    node head; // initially when the objec to fhte class is declared its value is by defualt null

    // method for addition of node
    void add(int data) {
        node new_node = new node(data);

        if (head == null) {
            head = new_node;
        } else {//the head should have the value first
            node temp = head;// Node object storing the value of head
            while (temp.next != null) {//means the next node to temp is not equals to null/empty ...... temp.next points  to next node
                temp = temp.next; //value of temp moves to next node
                // the loop continues until the program exits the loop.
            }// temp has the value of last node
            temp.next = new_node;


        }
    }

    //remove the linkedList
    void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }
        node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void add_first(int data) {
        node new_node = new node(data);
        new_node.next = head;
        head = new_node;
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " - >");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //for checking the length of the list
    void length() {
        node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println("Length : " + count);
    }

    // method for adding the function at the last
    void add_at_last(int data){
        node new_node = new node(data);

        if(head == null){
            head = new_node;
        }
        else {
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }


}

