class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLinkedList{
    Node head;
    // Add First
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    // Add Last
    void addLast(int data){
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
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
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    // Remove first
    void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    // Remove last
    void removeLast(){
        Node temp=head;
        Node ptr=head.next;
        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        ptr.prev=null;
    }
    // Remove at specific location
    void remove(int ind){
        Node temp=head;
        Node ptr=head.next;
        int i=0;
        while(i<ind-1){
            temp=ptr;
            ptr=ptr.next;
            i++;
        }
        temp.next=ptr.next;
        ptr.next.prev=temp;
    }
    // print list
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
class DoublyLinkedList{
    public static void main(String[] args) {
        DLinkedList dll = new DLinkedList();
        dll.addFirst(10);
        dll.print();
        dll.addFirst(20);
        dll.print();
        dll.addLast(30);
        dll.print();
        dll.add(2, 100);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.addLast(20);
        dll.addLast(30);
        dll.print();
        dll.remove(2);
        dll.print();
        dll.remove(1);
        dll.print();
        
        
        
    }
}