import java.util.Stack;

public class infix_to_prefix {
    public static void main(String[] args) {
        String infix = "9*9/8-9+6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String num_string = "" + ch;
                val.push(num_string);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String temp = o + v1 + v2;
                    val.push(temp);
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String temp = o + v1 + v2;
                    // pushing the string in the vals stack
                    val.push(temp);
                    // pushing the operator in the op stack
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String temp = o + v1 + v2;
                        val.push(temp);

                        op.push(ch);
                    } else op.push(ch);

                }
            }
        }

        //making the prefix
        while (val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String temp = o + v1 + v2;
            val.push(temp);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
