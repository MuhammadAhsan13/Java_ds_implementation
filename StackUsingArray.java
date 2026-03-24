class Stack{
    int[] s;
    int size=0;
    int capacity;
    int top;
    Stack(int capacity){
        this.capacity=capacity;
        s=new int[capacity];
        top=-1;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==capacity;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
        } else{
            top+=1;
            size+=1;
            s[top]=data;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            top-=1;
            size-=1;
        }
    }
    int peek(){
        return s[top];
    }
    int size(){
        return size;
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isFull());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isFull());  
    }
}
