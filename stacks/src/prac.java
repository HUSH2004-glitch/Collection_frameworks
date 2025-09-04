import java.util.Stack;
import java.util.*;

public class prac {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("===STACK SEARCHOPERATION===");
        String[] elements = {"apple", "banana", "cherry", "Date", "Elderberry"};
        System.out.println("Pushing elements");
        for (String element : elements) {
            stack.push(element);
            System.out.println("pushed" + element + " | Stack" + stack);

            // search operation
            String[] search_items = {"cherry", "banana", "Date"};
            for (String items : search_items) {
                int position = stack.search(items);
                if (position != -1) {
                    System.out.println("" + items + " found at position " + position);
                } else {
                    System.out.println("ITEM NOT FOUND :");
                }


            }
        }
        System.out.println(" ===PROCESSING THE ELEMENTS IN LIFO ORDER");//LIFO LAST IN FIRST OUT
        int count = 1;
        while (!stack.isEmpty()) {
            String collected = stack.pop();
            System.out.println("Processing order " + count + ":" + collected);
        }

        System.out.println("BASIC STACK OPERATION=======>");
        Stack<Integer> int_stack = new Stack<>();

        System.out.println("Stack Status -> EMPTY :" + int_stack.isEmpty());

        int_stack.push(10);
        int_stack.push(20);
        int_stack.push(30);
        int_stack.push(40);

        System.out.println(int_stack + " After push");
        System.out.println("Stack Size " + int_stack.size());

        System.out.println("peek_Operations : " + int_stack.peek());
        System.out.println("Stack after peek : " + int_stack);

        System.out.println("pop Operations ");
        while (!stack.isEmpty()) {
            System.out.println("popped : " + int_stack.pop());
            System.out.println("Stack now :" + stack);

        }
        System.out.println("Stack Status -> EMPTY :" + int_stack.isEmpty());

    }
}
