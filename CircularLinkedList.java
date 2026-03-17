class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SingleCircularLL{
    Node head;
    Node tail;
    // Add First
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;

        }
    }
    // Add Last
    void addLast(int data){
        Node newNode = new Node(data);
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }
    // Add at specific location
    void add(int ind,int data){
        Node temp=head;
        Node newNode = new Node(data);
        int i=0;
        while(i<ind-1){
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
    }else{
        head=head.next;
        tail.next=head;
    }
    }
    // Remove Last
    void removeLast(){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=tail.next;
        tail=temp;
    }
    // Remove at specific location
    void remove(int ind){
        Node temp=head;
        Node ptr = head.next;
        int i=0;
        while(i<ind-1){
            temp=ptr;
            ptr=ptr.next;
            i++;
        }
        temp.next=ptr.next;
    }
    // Print list
    void printList(){
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println(temp.data); // print head.data(first node) beacuse in circular linked list 
                                      // last node contains first node address.
    }
}
class CircularLinkedList{
    public static void main(String[] args) {
        SingleCircularLL sll = new SingleCircularLL();
        sll.addFirst(10);
        sll.printList();
        sll.addLast(20);
        sll.printList();
        sll.addFirst(50);
        sll.printList();
        sll.add(2,70 );
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.remove(1);
        sll.printList();
        
    }
}