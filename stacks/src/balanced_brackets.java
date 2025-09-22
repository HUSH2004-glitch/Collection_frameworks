import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public  static boolean Is_balanced(String str) {
        Stack<Character> st = new Stack<>();
        int limit = str.length();
        for (int i = 0; i < limit; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;
                if (st.peek() == '(') {
                    st.pop();
                }
            }

        }
        if (st.size() == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = sc.nextLine();
        System.out.println(Is_balanced(str));
    }
}
