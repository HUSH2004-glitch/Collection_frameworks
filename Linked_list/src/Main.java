import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        My_linked_list list = new My_linked_list();

        list.add(20);
        list.add(10);
        list.insert_at(2, 15);
        list.insert_at(0, 100);
        list.add(50);
        list.add(40);

        list.display();
        node mid= new node();
       mid = list.middle();
        System.out.println(mid);
        list.delete_middle();
        list.display();

    }
}