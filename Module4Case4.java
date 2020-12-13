// Java program to find smallest
// elements in singly linked list. 
class Module4Case4 {

    /* Use a Linked list class node */
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;

    // Function that returns smallest element from the linked list
    // from the linked list.
    static int smallestElement(Node head) {

        // Declare a min variable and initialize
        // it with INT_MAX value.
        // INT_MAX is integer type and its value
        // is 32767 or greater.
        int min = Integer.MAX_VALUE;

        // Check loop while head not equal to NULL
        while (head != null) {

            // If min is greater then head->data then
            // assign value of head->data to min
            // otherwise node point to next node.
            if (min > head.data)
                min = head.data;

            head = head.next;
        }
        return min;
    }

    // Function that push the element in linked list.
    static void push(int data) {
        // Allocate dynamic memory for newNode.
        Node newNode = new Node();

        // Assign the data into newNode.
        newNode.data = data;

        // newNode->next assign the address of
        // head node.
        newNode.next = (head);

        // newNode become the headNode.
        (head) = newNode;
    }

    // Display linked list.
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("DONE");
    }

    // Driver code
    public static void main(String[] args) {
        // Start with empty list
        // head = new Node();

        // Using push() function to add values to linked list
        push(11);
        push(10);
        push(4);
        push(3);
        push(15);
        push(30);
        System.out.println("Linked list is : ");

        // Call printList() function to
        // display the linked list.
        printList(head);

        // Call smallestElement() function to get
        // smallest element in linked list.
        System.out.println("Minimum element in linked list: " + smallestElement(head));
    }
}

// Resources
// https://www.geeksforgeeks.org/find-smallest-largest-elements-singly-linked-list/
