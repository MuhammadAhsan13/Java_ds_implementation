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
class LL{
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
            head.prev=newNode;
            head=newNode;
            tail.next=head;
        }
    }
    // Add Last
    void addLast(int data){
        Node newNode = new Node(data);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=head;
    }
    // Add at specific position
    void add(int ind,int data){
        Node newNode = new Node(data);
        Node temp=head;
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
            return;
        }
        head=head.next;
        head.prev=tail;
        tail.next=head;
    }
    // Remove last
    void removeLast(){
        Node temp=head;
        Node ptr=head.next;
        while(ptr.next!=head){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        tail=temp;
        head.prev=tail;
    }
    // Remove at specific position
    void remove(int ind){
        if(ind==0){
            removeFirst();
            return;
        }
        Node temp = head;
        Node ptr = head.next;
        int i=0;
        while(i<ind-1){
            temp=ptr;
            ptr=ptr.next;
            i++;
        }
        temp.next=ptr.next;
        ptr.next.prev=temp;
    }
    // Print list
    void printList(){
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println(temp.data);
    }
}
public class CircularDoublyLL {
    public static void main(String[] args) {
        LL cdll = new LL();
        cdll.addFirst(10);
        cdll.printList();
        cdll.addLast(20);
        cdll.printList();
        cdll.add(1,30);
        cdll.printList();
        cdll.removeFirst();
        cdll.printList();
        cdll.removeLast();
        cdll.printList();
        cdll.addLast(40);
        cdll.addLast(50);
        cdll.printList();
        cdll.remove(1);
        cdll.printList();
        

    }
}
