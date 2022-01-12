//package ABCG;

//class LinkedList {
//	 
//    static Node head;
// 
//    static class Node {
// 
//        int data;
//        Node next;
// 
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
// 
//    /* Function to reverse the linked list */
//    Node reverse(Node node)
//    {
//        Node prev = null;
//        Node current = node;
//        Node next = 0;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//            
//            System.out.print(node.data+"R");
//            System.out.println(current.data+"S");
//            System.out.print(current.next.data);
//        }
//        node = prev;
//        return node;
//    }
// 
// 
//    // prints content of double linked list
//    void printList(Node node)
//    {
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }
// 
//    // Driver Code
//    public static void main(String[] args)
//    {
//        LinkedList list = new LinkedList();
//        list.head = new Node(1);
//        list.head.next = new Node(2);
//        list.head.next.next = new Node(3);
//        list.head.next.next.next = new Node(4);
// 
//        System.out.println("Given Linked list");
//        list.printList(head);
//        head = list.reverse(head);
//        System.out.println("");
//        System.out.println("Reversed linked list ");
//        list.printList(head);
//    }
//}
 
// This code has been contributed by Mayank Jaiswal