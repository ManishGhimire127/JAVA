// Demonstrate the different operations of Stack
// This class defines an integer stack that can hold 10 values.
class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        // push some numbers onto the stack 
        for(int i=0; i<10; i++) 
        mystack1.push(i); // pop those numbers off the stack 
        System.out.println("Stack in mystack1:"); 
        for(int i=0; i<10; i++) 
        System.out.println(mystack1.pop());
    }
}
class Stack {
    int stack[] = new int[10];
    int tos;
    // Initialize top-of-stack 
    Stack() {
    tos = -1;
    } 
    // Push an item onto the stack 
    void push(int item) {
    if (tos == 9) 
    System.out.println("Stack is full.");
    else{
        stack[++tos] = item;
    }
}
    // Pop an item from the stack 
    int pop() {
    if (tos < 0) {
        System.out.println("Stack underflow.");
        return 0;
    } 
    else 
    {
        return stack[tos--];
    }
    }
    
}
