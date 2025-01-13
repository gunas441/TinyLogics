package LinkedList;

public class LinkedList {
        Node head;

        // Method to add a regular customer to the end of the list
        void addCustomer(String name, String details) {
            Node newNode = new Node(name, details);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to add a VIP customer at the beginning of the list
        void addVIPCustomer(String name, String details) {
            // Create a new node
            Node newNode = new Node(name, details);

            // Point the new node's next to the current head
            newNode.next = head;

            // Make the new node the new head of the list
            head = newNode;
        }

        // Method to print the linked list
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.name + " (" + current.details + ")");
                current = current.next;
                if (current != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(" -> null");
        }

        private static class Node {
            String name;
            String details;
            Node next;

            Node(String name, String details) {
                this.name = name;
                this.details = details;
                this.next = null;
            }
        }
        public static void main(String[] arg){
            LinkedList waitlist = new LinkedList();
            // Adding regular customers
            waitlist.addCustomer("Alice", "Party of 2");
            waitlist.addCustomer("Bob", "Party of 3");

            // Adding VIP customers
            waitlist.addVIPCustomer("VIP Charlie", "Party of 1");
            waitlist.addVIPCustomer("VIP Dave", "Party of 4");

            // Adding another regular customer
            waitlist.addCustomer("Eve", "Party of 2");

            // Displaying the final waitlist
            waitlist.printList();

        }

}
