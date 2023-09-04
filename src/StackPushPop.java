import java.util.Stack;

public class StackPushPop {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackPushPop(int size) {
        //sama kalo dia private int maxSize itu jadi size
        //jadi this.size = size
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("stack full. Gabisa masukin " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " telah ditambakan ke stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Pop gagal coy!");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println(value + "telah dihapus dari stack");
            return value;
        }
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("stack kosong");
            return -1;
        } else {
            System.out.println(stackArray[top]);
            return stackArray[top];
        }
    }


    public static void main(String[] args) {
        StackPushPop stack = new StackPushPop(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.peek();
    }
}
