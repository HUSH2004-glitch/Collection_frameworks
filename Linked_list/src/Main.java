public class Main {
    public static void main(String[] args) {
        My_linked_list list = new My_linked_list();

        list.add(20);
        list.add(10);
        list.insert_at(2, 15);
        list.insert_at(0, 100);
        list.display();
        int temp = list.get_by_data(30);
        list.remove_by_index(2);
    }
}