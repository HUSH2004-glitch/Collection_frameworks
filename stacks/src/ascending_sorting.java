import java.util.Scanner;
import java.util.Stack;

public class ascending_sorting {
    public void sort_stack(Stack<Integer> stack_int){
        Stack<Integer> temp_stack = new Stack<>();
        while (!stack_int.isEmpty()){
            int temp = stack_int.pop();

            while(!temp_stack.isEmpty() && temp_stack.peek() > temp){
                stack_int.push(temp_stack.pop());
            }
            temp_stack.push(temp);

            System.out.println("<=====================================>");
            System.out.println(temp_stack);
            System.out.println("<=====================================>");

        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 6; i++) {
            stack_int.push(i * 10);
        }
        System.out.println(stack_int);
        System.out.println("<=====================================>");

    }
}
