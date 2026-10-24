public class linkedlist {

    public static void  length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.println(count);
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;

        }
        System.out.println();

    }

    public static class Node {
        int data; // this is value
        Node next; // address of next node

        Node(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(34);
        // 5-> 3 -> 9 -> 8 -> 16 34
        a.next = b; // 5-> 3 9 8 16 34
        b.next = c; // 5-> 3 -> 9 8 16 34
        c.next = d; // 5-> 3 -> 9 -> 8 16 34
        d.next = e; // 5-> 3 -> 9 -> 8 -> 16 -> 34
        e.next = f;

        display(a);
        length(a);

    }
}
class Student{
    String name;
    int age;
    int rollnum;

}
class Engineerings extends   Student{
    void print(){
        System.out.println("");                                         
    }
}