import java.util.Stack;
import java.util.*;

public class adding_element_anywhere {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 6; i++) {
            stack_int.push(i * 10);

        }
        System.out.println(stack_int);
        System.out.println("<=====================================>");
        System.out.print("Enter the Index :");
        int index = sc.nextInt();
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        //creating a new temporary stack for copying the top elements using temp.pop();
        Stack<Integer> temp = new Stack<>();
        while (stack_int.size() > index) {
            temp.push(stack_int.pop());

        }
        stack_int.push(number);
        System.out.println(stack_int);

        while (temp.size() > 0) {

            stack_int.push(temp.pop());

        }
        System.out.println("<=====================================>");
        System.out.println(stack_int);
        System.out.println("<=====================================>");
    }
}
