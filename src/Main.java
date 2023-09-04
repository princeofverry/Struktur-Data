import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        boolean resultStack = stack.empty();

        System.out.println("apakah stack kosong? " + resultStack);

        stack.push(78);
        stack.push(12);
        stack.push(22);
        stack.push(11);
        stack.push(10);

        System.out.println("Hasil Stack Sekarang" + stack);

        stack.pop();
        stack.pop();

        System.out.println("Hasil Stack Sekarang" + stack);

    }
}