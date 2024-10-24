package practiceprograms;

import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int value) {
        data = value;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList {
    public Node head = null;

    public void insert_at_begin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
        }
    }

    public void insert_at_position(int data, int position) {
        if (position == 0) {
            insert_at_begin(data);
            return;
        }
        Node newnode = new Node(data);
        Node current = head;
        int currPosition = 0;

        while (current != null && currPosition < position) {
            current = current.next;
            currPosition++;
        }

        if (current == null) {
            insert_at_end(data);
        } else {
            newnode.next = current;
            newnode.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = newnode;
            }
            current.prev = newnode;
        }
    }

    public void delete_at_begin() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        } else {
            Node temp = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            temp.next = null;
        }
    }

    public void delete_at_end() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            if (temp == head) {
                head = null; 
            } else {
                temp.prev.next = null; 
            }
        }
    }

    public void delete_at_pos(int position) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (position == 0) {
            delete_at_begin();
            return;
        }

        Node temp = head;
        int currentIndex = 0;

        while (temp != null && currentIndex < position) {
            temp = temp.next;
            currentIndex++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next; 
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        temp.next = null; 
        temp.prev = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " "); 
                temp = temp.next;
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        int choice, value, position;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at certain position");
            System.out.println("4. Delete at beginning");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at certain position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    value = scan.nextInt();
                    list.insert_at_begin(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    value = scan.nextInt();
                    list.insert_at_end(value);
                    break;
                case 3:
                    System.out.print("Enter position to insert: ");
                    position = scan.nextInt();
                    System.out.print("Enter value to insert: ");
                    value = scan.nextInt();
                    list.insert_at_position(value, position);
                    break;
                case 4:
                    list.delete_at_begin();
                    break;
                case 5:
                    list.delete_at_end();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    position = scan.nextInt();
                    list.delete_at_pos(position);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
