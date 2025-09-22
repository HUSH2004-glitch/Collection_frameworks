import java.util.*;


public class valuation {


    public static void infix(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // Perform operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();

                    if (operator == '+') val.push(v1 + v2);
                    else if (operator == '-') val.push(v1 - v2);
                    else if (operator == '*') val.push(v1 * v2);
                    else if (operator == '/') val.push(v1 / v2);
                }
                op.pop(); // Remove '(' from stack
            } else if (ch == '+' || ch == '-') {
                while (!op.isEmpty() && op.peek() != '(') {
                    // Perform operation for hhgher or equal precedence
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();

                    if (operator == '+') val.push(v1 + v2);
                    else if (operator == '-') val.push(v1 - v2);
                    else if (operator == '*') val.push(v1 * v2);
                    else if (operator == '/') val.push(v1 / v2);
                }
                op.push(ch);
            } else if (ch == '*' || ch == '/') {
                if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {

                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();

                    if (operator == '*') val.push(v1 * v2);
                    else if (operator == '/') val.push(v1 / v2);
                }
                op.push(ch);
            }
        }

        // Process remaining operations
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();

            if (operator == '+') val.push(v1 + v2);
            else if (operator == '-') val.push(v1 - v2);
            else if (operator == '*') val.push(v1 * v2);
            else if (operator == '/') val.push(v1 / v2);
        }

        System.out.println(val.peek());

    }

    public static void postfix_valuation(String str) {
        // referance string 12+123*+-;
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            try {
               char ch = str.charAt(i);
               if(Character.isDigit(ch)){
                   int num =  ch - '0';
                   val.push(num);
                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                   char operator = ch ;
                   int v2 = val.pop();
                   int v1 = val.pop();

                    if (operator == '+') val.push((v1 + v2));
                    else if (operator == '-') val.push((v1 - v2));
                    else if (operator == '*') val.push((v1 * v2));
                    else if (operator == '/') val.push((v1 / v2));
                }
            } catch (Exception E) {
                System.out.println("Exception :" + E + " occurs at this " + i + " iteration"+"currently val.peek() =" + val.peek());
            }
        }
        System.out.println("Solution :" + val.peek());

    }

    public static void main(String[] args) {
        String str = "12+123*+-";
        System.out.println("Hey There!");
        while (true) {
            System.out.println("Enter your choice :");
            System.out.println("1.infix valuation.");
            System.out.println("2.postfix valuation.");
            System.out.println("0.Exit");
            System.out.print("Your Choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("<-------------------------------------->");
            switch (choice) {
                case 1:
                    infix(str);
                case 2:
                    postfix_valuation(str);
            }
        }
    }
}