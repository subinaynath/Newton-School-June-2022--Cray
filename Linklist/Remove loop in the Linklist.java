class Solution
{

    // //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow =head, fast=head, temp= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
          //loop detected
            if(slow == fast) {
            slow=head;
            while( slow != fast){
                slow= slow.next;
                fast=fast.next;
            }
            temp = slow;
            while(temp.next != slow){
                temp= temp.next;
                
            }
            temp.next= null;
                
                
            }

            
        }
        
    }
}
