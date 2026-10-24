// public class linkedlist {

//     public static void  length(Node head) {
//         int count = 0;
//         while (head != null) {
//             count++;
//             head = head.next;
//         }
//         System.out.println(count);
//     }

//     public static void display(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "  ");
//             temp = temp.next;

//         }
//         System.out.println();

//     }

//     public static class Node {
//         int data; // this is value
//         Node next; // address of next node

//         Node(int data) {
//             this.data = data;

//         }
//     }

//     public static void main(String[] args) {
//         Node a = new Node(5);
//         // System.out.println(a.next);
//         Node b = new Node(3);
//         Node c = new Node(9);
//         Node d = new Node(8);
//         Node e = new Node(16);
//         Node f = new Node(34);
//         // 5-> 3 -> 9 -> 8 -> 16 34
//         a.next = b; // 5-> 3 9 8 16 34
//         b.next = c; // 5-> 3 -> 9 8 16 34
//         c.next = d; // 5-> 3 -> 9 -> 8 16 34
//         d.next = e; // 5-> 3 -> 9 -> 8 -> 16 -> 34
//         e.next = f;

//         display(a);
//         length(a);

//     }
// }
// class Student{
//     String name;
//     int age;
//     int rollnum;

// }
// class Engineerings extends   Student{
//     void print(){
//         System.out.println("");                                         
//     }
// }
// public class linkedlist {
//     public static  class Node{
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class linked {
//         Node head = null;
//         Node tail = null;

//         void insertAtEnd(int val) {
//             Node temp = new Node(val);
//             if (head == null) {
//                 head = temp;
//                 tail = temp;
//             } else {
//                 tail.next = temp;

//             }
//             tail = temp;

//         }

//         void display(){
//             Node temp = head;

//             while(temp != null){
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;

//             }

//         }
//     }

//     public static void main(String[] args) {
//         linked l1 = new linked();
//         l1.insertAtEnd(2);
//         l1.insertAtEnd(8);
//         l1.insertAtEnd(6);
//         l1.display();
//     }
// }

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class list_RR {
        Node head = null;
        Node tail = null;
        
        //insertion at the end
        void insertAtEnd(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
       
        //insertion at the biggining
        void insertAtHead(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        //insertion at the specific index and value 
        void inseratIndex(int idx , int val){
            Node t = new Node(val);
            Node temp =head;

            for(int i =1 ;i<=(idx-1);i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;


        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        list_RR a = new list_RR();
        a.insertAtEnd(5);
        a.display();
        a.insertAtHead(6);
        a.display();
        a.insertAtHead(2);
        a.display();
        a.insertAtEnd(7);
        a.display();
        a.insertAtHead(3);
        a.display();
        a.insertAtEnd(9);
        a.inseratIndex(3,24);
        a.display();
        a.insertAtHead(6);
        a.display();
        a.insertAtHead(14);
        a.display();
    }
}