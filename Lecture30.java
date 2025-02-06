import java.util.*;

public class Lecture30 {
    
    // static class Node {
    //     int data;
    //     Node next;
        
    //     public Node(int data) {
    //         this.data = data;
    //         next = null;
    //     }
    // }
    
    // static class stack {
    //     public static Node head;

    //     public static boolean isEmpty() {
    //         return head == null;
    //     }

    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if (isEmpty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;

    //         }
    //         int Top = head.data;
    //         head = head.next;
    //         return Top;
    //     }

    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;

    //         }
    //         return head.data;
    //     }
    // }
    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size() == 0;
    //     }
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         int Top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return Top;
    //     }
    //     public static int peek(){
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    // @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Strack in data structure
        // Push(),Pop(),peek() operation
        //stack implementation through JCF
        // Stack<Integer> stk = new Stack<>();
        // stk.add(87);
        // stk.add(26);
        // stk.add(72);
        // stk.add(82);
        // stk.add(20);
        // System.err.println(stk + " ");
        // Stack implementation through linked list DS
        // stack s = new stack();
        // s.push(86);
        // s.push(62);
        // s.push(12);
        // s.push(72);
        // while(!s.isEmpty()){
            //     System.out.println(s.peek());
            //     s.pop();
            // }
            //Stack Implementation through arraylist
            // Stack stk = new Stack();
            // stk.push(98);
            // stk.push(18);
            // stk.push(28);
            // while(!stk.isEmpty()){
                //     System.out.println(stk.peek());
                //     stk.pop();
                // }
                // Question
                Stack<Integer> stk = new Stack<>();
                stk.add(1);
                stk.add(2);
                stk.add(3);
                stk.add(4);
                while(!stk.isEmpty()){
                  stk.pop();
                
                }
                stk.add(5);
                System.out.println(stk);
    }
}
