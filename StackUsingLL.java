class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackLL{
    Node top;
    int size;

    boolean isEmpty(){
        return top==null;
    }
    void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top=newNode;
            size++;
        }else{
            newNode.next=top;
            top=newNode;
            size++;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        top=top.next;
        size--;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    int size(){
        if(isEmpty()){
            return -1;
        }
        return size;
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data);
        }
    }
}
class StackUsingLL{
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        System.out.println("After pop top element");
        st.display();
        System.out.println("Size of stack");
        System.out.println(st.size());
        System.out.println("Peek element");
        st.peek();   
    }
}