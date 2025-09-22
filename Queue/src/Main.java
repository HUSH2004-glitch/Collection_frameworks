import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class queue {
        int[] arr ;
        int index = 0;

        queue(int limit){
            arr = new int[limit];
        }
        public void display() {
            System.out.println("<--------------------------->");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("->" + arr[i]);
            }
            System.out.println("\n" + "<--------------------------->" + "\n");
        }

        public void add(int element) {
            if (index >= arr.length) {
                System.out.println("overflowed");
                return;
            }
            arr[index] = element;
            index++;
        }

        public void remove() {
            for (int i = 0; i < arr.length - 1; i++) {
                if (index == 0) {
                    System.out.println("empty queue!");
                    return;
                }
                arr[i] = arr[i + 1];
                System.out.println("after :" + arr[i]);
            }
            arr[index] = 0;
            index--;
        }

        //is_empty();
        public boolean is_empty() {
            if (index == 0) {
                return true;
            } else return false;
        }

        public boolean is_full() {
            if (index == arr.length) {
                return true;
            } else return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("HEY BRO :");
        System.out.print("Enter the limit of you Queue :");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        queue temp = new queue(limit);
        temp.add(100);
        temp.add(300);
        temp.display();
        temp.remove();
        temp.display();

    }
}
