public class linkedlist{
    public static void display(Node head){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp= temp.next;

        }


    }
    public static class Node{
        int data; // this is value
        Node next; // address of next node 

        Node(int data){
            this.data=data;

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
        //5-> 3 -> 9 -> 8 -> 16 34
        a.next=b;   //5-> 3  9  8  16 34
        b.next= c;  //5-> 3 -> 9  8  16 34
        c.next=d;   //5-> 3 -> 9 -> 8  16 34
        d.next = e; //5-> 3 -> 9 -> 8 -> 16 -> 34
        e.next=f;

        // System.out.println(a.next); //@251a69d7
        // System.out.println(b);  //@251a69d7
        // System.out.println(c);  //@7344699f
        // System.out.println(d);  //@6b95977
        // System.out.println(e);  //@7e9e5f8a

        //Display a lnkedlist 

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);
        
        //using other method
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        //using for loop
        display(a);


        
        
    }
}
