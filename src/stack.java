//public class stack {
//    node top;
//    int number;
//
//    public stack(){
//        top = null;
//        number = 0;
//    }
//
//    public boolean isEmpty(){
//        return top == null;
//    }
//
//    public void push(Integer d) {
//        top = new node (d,top);
//        number++;
//    }
//
//    public void pop() {
//       top = top.getPointer().getPointer();
//       number-=2;
//
//       if(top == null) {
//           System.out.println("Hahh?!! KOSONGGG");
//           return;
//       }
//    }
//
//    public static void main(String[] args) {
//        stack x = new stack();
//        x.push(2);
//        x.push(3);
//        x.push(4);
//
//
//    }
//
//}
