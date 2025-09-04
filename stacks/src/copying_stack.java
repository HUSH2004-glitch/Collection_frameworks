import java.util.Stack;
import java.util.*;

public class copying_stack {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.println("Enter the number of Elements you want to add:");
        limit = sc.nextInt();
        System.out.println("Enter the element :");
        for (int i = 0; i < limit; i++) {
            int input = sc.nextInt();
            stack_int.push(input);
        }
        System.out.println("YOUR STACK ELEMENTS :");
        System.out.println("<======================================>");
        System.out.println(stack_int);
        System.out.println("<======================================>");


        //reversing
        System.out.println("Reversal of te stack and then copying it ");
        Stack<Integer> rev_stack = new Stack<>();
        while (stack_int.size()>0) {
            rev_stack.push(stack_int.pop());

        }
        System.out.println("REVERSED STACK :");
        System.out.println("<======================================>");
        System.out.println(rev_stack);
        System.out.println("<======================================>");

        Stack<Integer> copied_stack = new Stack<>();
        while(rev_stack.size()>0){
            copied_stack.push(rev_stack.pop());
        }
        System.out.println("COPIED STACK :");
        System.out.println("<======================================>");
        System.out.println(copied_stack);
        System.out.println("<======================================>");


        System.out.println("OR YOU CAN GO SIMPLE ");
        Stack<Integer> temp = new Stack<>();
        temp.addAll(copied_stack);
        System.out.println("COPIED STACK USING THE addAll() :");        System.out.println("<======================================>");

        System.out.println("<======================================>");
        System.out.println(temp);
        System.out.println("<======================================>");




        System.out.println("HUSH.....");
    }

}
