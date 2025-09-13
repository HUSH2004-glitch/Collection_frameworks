// It's quite better implementation of stack as an array

public class array_implementation__ {
    public static class Stack {
        private int[] arr = new int[10];
        private int index = 0;


        // stack display
        public void display() {
            if (index == 0) {
                System.out.println("Stack empty!");
            }
            for (int i = 0; i < index; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println("\n");
        }

        // stack push
        public void push(int x) {
            if(index >=arr.length){
                System.out.println("Stack overflowed");
            }
            arr[index] = x;
            index++;
        }

        //stack peek
        public int peek() {
            if (index == 0) {
                System.out.println("Stack is empty!!!");
                return -1;
            }
            return arr[index - 1];
        }
            //stack pop
        public int  pop(){
            if(index ==0){
                System.out.println("Empty stack !!!");
                return -1;
            }
            int temp = arr[index-1];
            arr[index-1] = 0;
            index --;
            return temp;
        }

        // stack_size
    public int size(){
            return index ;
    }

    //Is_empty
        public boolean Is_empty(){
            if(index==0 ){
                return true;
            }
            else return false;
        }

        //Is_full
        public boolean Is_full(){
            if(index >=arr.length){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack stack_int = new Stack();
        stack_int.push(4);
        stack_int.display();
        stack_int.push(6);
        stack_int.display();
        stack_int.push(1);
        stack_int.pop();
        stack_int.display();
        System.out.println(stack_int.size());
    }

}
