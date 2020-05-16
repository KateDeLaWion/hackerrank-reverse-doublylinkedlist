public class Solution {

    // https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists

//    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {


//  // my code starts here
        if (head == null){
          return head;
        }
        DoublyLinkedListNode current = head; // make a current node to traverse
        DoublyLinkedListNode newHead = head;
        while (current != null){
        DoublyLinkedListNode previous = current.prev;
        current.prev = current.next;
        current.next = previous;
        newHead = current;
        current = current.prev; // traverse from right to left.
        }
        return newHead;
//        // my code ends here



//    }


}
