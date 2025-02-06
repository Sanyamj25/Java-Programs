// import java.util.*;
public class Lecture27_28 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addElement(String data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void DeleteEle(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    // public void reverseIterate(){
    //     if(head == null || head.next == null){
    //         return;
    //     }
    //     Node preNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null){
    //         Node nextNode = currNode.next;
    //         currNode.next = preNode;

    //         //Update
    //         preNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = preNode;
    // }
    // }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        //Linked List
        Lecture27_28 list = new Lecture27_28();
        list.addElement("sanyam");
        list.addElement("Jain");
        list.addElement("Kishanpura");
        list.printList();
        // list.DeleteEle();
        // list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();


        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(9);
        // list.add(8);
        // list.add(10);
        // list.addFirst(4);
        // list.addLast(6);
        // System.out.println(list.size());
        // list.remove(4);
        // System.out.print(list);
        
    }
}
