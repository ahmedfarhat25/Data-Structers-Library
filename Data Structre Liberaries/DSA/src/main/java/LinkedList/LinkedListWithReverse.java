package LinkedList;
public class LinkedListWithReverse extends LinkedListOOP {
    
        public void reverse() {
            if (isEmpty() || head.next == null) {
                return; // No need to reverse if the list is empty or has one element
            }
    
            Node prev = null;
            Node current = head;
            Node next;
    
            while (current != null) {
                next = current.next; // Store the next node
                current.next = prev; // Reverse the current node's pointer
                prev = current;      // Move `prev` to the current node
                current = next;      // Move `current` to the next node
            }
    
            // After the loop, `prev` will be the new head
            head = prev; // Update the head
        }
    }