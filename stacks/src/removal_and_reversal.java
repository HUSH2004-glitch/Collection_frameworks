import java.util.Scanner;
import java.util.Stack;

public class removal_and_reversal {
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
        System.out.println("Enter  the index of the element to remove");
        int input_remove = sc.nextInt();
        Stack<Integer> temp = new Stack<>();

        while(stack_int.size()>input_remove){
            temp.push(stack_int.pop());

        }
        stack_int.pop();
        //putting the rest of the elements back to the main stack
        while(temp.size()>0){
            stack_int.push(temp.pop());

        }
        System.out.println("YOUR STACK ELEMENTS :");
        System.out.println("<======================================>");
        System.out.println(stack_int);
        System.out.println("<======================================>");

        //reversing but space complexity issues using two stacks
        Stack<Integer>temp_2 = new Stack<>();

        while(stack_int.size()>0){
            temp.push(stack_int.pop());
        }
        while(temp.size()>0){
            temp_2.push(temp.pop());
        }
        while(temp_2.size()>0){
            stack_int.push(temp_2.pop());
        }
        System.out.println("YOUR REVERSED STACK ELEMENTS :");
        System.out.println("<======================================>");
        System.out.println(stack_int);
        System.out.println("<======================================>");
        sc.close();
    }
}
