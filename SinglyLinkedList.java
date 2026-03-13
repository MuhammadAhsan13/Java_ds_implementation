class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    // Add First
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    // Add Last
    void addLast(int data){
        Node temp=head;
        Node newNode = new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

        }
        // Add at specific location
        void add(int index,int data){
            Node temp=head;
            Node newNode = new Node(data);
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        // Remove First
        void removeFirst(){
            if(head==null){
                System.out.println("List is empty");
            }
            else{
                head=head.next;
            }
        }
        // Remove Last
        void removeLast(){
            Node temp=head;
            Node ptr=head.next;
            while(ptr.next!=null){
                temp=ptr;
                ptr=ptr.next;
            }
            temp.next=ptr.next;
        }
        // Remove at specific positon
        void remove(int index){
            Node temp=head;
            Node ptr=head.next;
            int i=0;
            while(i<index-1){
                temp=ptr;
                ptr=ptr.next;
                i++;
            }
            temp.next=ptr.next;

        }
        // print LinkedList
        void printList(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
}
class SinglyLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.add(2,50);
        ll.printList();
        ll.removeFirst();
        ll.printList();
        ll.removeLast();
        ll.printList();
        ll.remove(1);
        ll.printList();
       
        
        
    }
}