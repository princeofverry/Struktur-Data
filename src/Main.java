public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        boolean resultStack = stack.empty();
//
//        System.out.println("apakah stack kosong? " + resultStack);
//
//        stack.push(78);
//        stack.push(12);
//        stack.push(22);
//        stack.push(11);
//        stack.push(10);
//
//        System.out.println("Hasil Stack Sekarang" + stack);
//
//        stack.pop();
//        stack.pop();
//
//        System.out.println("Hasil Stack Sekarang" + stack);
//
//        int z = 72 / 9 * 20;
//        System.out.println("hasil perhitungan :" + z);

//        NodeBaru a = new NodeBaru(3, null);
//        NodeBaru b = new NodeBaru(5, a);
//        NodeBaru c = new NodeBaru(7, b);

//        atau jika tanpa diubah
//        NodeBaru a = new NodeBaru(3);
//        NodeBaru b = new NodeBaru(5);
//        NodeBaru c = new NodeBaru(7);
//        a.pointer = b;
//        b.pointer = c;

    }


}

class NodeBaru {
    int dt;
    NodeBaru pointer;


    public NodeBaru(int dt, NodeBaru pointer) {
        this.dt = dt;
        this.pointer = pointer;
    }

    public int getDt(){return dt;}
    public NodeBaru getPointer() {return pointer;}

    public void setDt(int dt) {
        if(dt < 0) {
            return;
        } else {
            this.dt = dt;
        }
    }

    public void setPointer(NodeBaru pointer) {
        this.pointer = pointer;
    }

}

class Tumpukan{
    NodeBaru top;
    int number;

    public Tumpukan(){
        top = null;
        number = 0;
    }

    public void push(int p) {
        if(p % 2 == 1) {
            top = new NodeBaru(p, top);
            number++;
        }
    }
}