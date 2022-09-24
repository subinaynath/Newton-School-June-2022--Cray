class Main{
    public static void main(String[] args) {
        MyLinkist ll= new MyLinkist();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.add(2);
        ll.add(0);
        ll.add(2);
        ll.add(2);
        ll.rearrange();
        ll.display();

    }
}
class MyLinkist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    Node head;
    public  Node add(int x){
        Node newNode = new Node(x);
        if(this.head == null){
            this.head = newNode;
            return this.head;
        }
        Node tr= this.head;
        while(tr.next != null){
            tr=tr.next;
        }
        tr.next = newNode;
        return this.head;
    }
    public void display(){
        Node tr= this.head;
        if(tr == null){
            System.out.print("null");
//            nikhilms121@gmail.com

            return;
        }
        while(tr != null){
            System.out.print(tr.data+" ");
            tr=tr.next;
        }
    }

    // threeway 0 1 1 2 2 2 2 2
    public void rearrange(){

        int arr[] = {0, 0, 0};
        Node tr = this.head;
        while (tr != null)
        {
            arr[tr.data]++;
            tr = tr.next;
        }
        int i = 0;
        tr = head;
        while (tr != null)
        {
            if (arr[i] == 0)
                i++;
            else
            {
                tr.data= i;
                --arr[i];
                tr = tr.next;
            }
        }



    }
//    public void swap(Node node,Node node1){
//        int temp= node1.data;
//        node1.data= node.data;
//        node.data= temp;
//    }

 }
