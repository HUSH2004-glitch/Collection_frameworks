// i think it's an implementation of stacks as array
// so i'll make 2 methods push and pop
// the stack willbe considered as static
// the array should behave like a stack

import java.util.*;

public class array_as_stack {
    // display
//    public static void display(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(" " + array[i]);
//        }
//        System.out.println(" fin");
//    }
//
//    // pop
//    public static int pop(int[] array) {
//        int top = array.length - 1;
//        int popped = 0;
//        for (int i = 0; i < top; i++) {
//            if (i >= top) {
//                System.out.println("Stack underflowed");
//            } else {
//                popped = array[top];
//                array[top] = 0;
//            }
//        }
//        return popped;
//    }
//
//
//    //push
//    public static void push(int[] array, int element) {
//        int top = array.length - 1;
//        for (int i = 0; i < top; i++) {
//            if (i >= top) {
//                System.out.println("Stack Overflowed!");
//
//            } else {
//                array[top] = element;
//            }
//        }
//    }
//
//    //peek taking the top element without removing it
//    public static void peek(int[] array) {
//        int top = array.length - 1;
//        for (int i = 0; i < top; i++) {
//            if (i >= top) {
//                System.out.println("empty stack !");
//            }
//            System.out.println(array[top]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] array = new int[5];
//        System.out.println("Enter Your array elements :");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        while (true) {
//            System.out.println(" 1.Add the element at the top:");
//            System.out.println("2.remove  and get the top element:");
//            System.out.println("3.Printing the top element :");
//            System.out.println("0.Exit:");
//            System.out.println("<------------------------------------->");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the element : ");
//                    int element_input = sc.nextInt();
//                    push(array,element_input);
//                    display(array);
//                    break;
//
//                case 2:
//                    System.out.print("Removed Element :");
//                    int removed_element = pop(array);
//                    System.out.println("Updated Array");
//                    display(array);
//                    break;
//
//                case 3:
//                    System.out.print(" Last element of the Stack :");
//                    peek(array);
//                    break;
//                default:
//                    System.out.println("Invalid input");
//                    break;
//            }
//        }
//    }
}
