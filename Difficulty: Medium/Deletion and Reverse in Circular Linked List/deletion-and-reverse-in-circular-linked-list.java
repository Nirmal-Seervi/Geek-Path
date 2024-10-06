//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    // Function to print nodes in a given circular linked list
    static void printList(Node head) {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int key = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            tail.next = head; // Make the list circular
            Solution ob = new Solution();
            Node current = ob.deleteNode(head, key);
            Node rev = ob.reverse(current);
            printList(rev);
        }
    }
}

// } Driver Code Ends

class Solution {
    Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head;
        }
        
        Node prev = null;
        Node current = head;
        Node next = null;
        
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);
        
        head.next = prev;
        head = prev;
        
        return head;
    }
    
    Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }
        
        Node current = head;
        Node prev = null;

        if (head.data == key) {
            if (head.next == head) {
                return null;
            }
            
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            
            last.next = head.next;
            head = head.next;
            
            return head;
        }
        
        do {
            prev = current;
            current = current.next;
            
            if (current.data == key) {
                prev.next = current.next;
                return head;
            }
        } while (current != head);
        
        return head;
    }
}