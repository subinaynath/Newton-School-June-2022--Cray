class IDE{
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        int k=4;
//        ll.display();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(8);
//        ll.display();
        System.out.println();
//        ll.kth(ll.head,k);
        ll.reverse(ll.head);
        ll.display();



    }
}

class Linklist{
   public class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
           this.next=null;
       }
   }
   Node head;

   // too add element in linklist
   public Node add(int x){
       Node newNode= new Node(x);
       if(this.head == null){
           this.head= newNode;
           return this.head;
       }
       Node tr=this.head;
       while(tr.next != null){
           tr=tr.next;
       }
       tr.next=newNode;
       return  this.head;
   }

   public void display(){
       Node tr= this.head;
       if(tr == null){
           System.out.println("null");
           return;
       }
       while(tr != null){
           System.out.print(tr.data+" ");
           tr=tr.next;
       }
   }
    // make till kth node
    public Node kth(Node head, int k){
       int count=1;
       Node tr=head;
       while (count !=k){
           tr=tr.next;
           count++;
       }
       tr.next= null;
       return  head;
    }

    //reverse the linklist
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head= prev;
        return head;
    }

}
