class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        if (!hasCycle) {
            return;
        }
        
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        Node cycleStart = slow;
        Node current = cycleStart;
        
        while (current.next != cycleStart) {
            current = current.next;
        }
        
        current.next = null;
    }
}
