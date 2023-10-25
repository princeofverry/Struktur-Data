//public class stackWarmUp {
//    node topGanjil;
//    node topGenap;
//    int numberGanjil;
//    int numberGenap;
//
//    int limitGenap = 10;
//    int limitGanjil = 15;
//
//    public stackWarmUp(){
//        topGanjil = null;
//        topGenap = null;
//        numberGanjil = 0;
//        numberGenap = 0;
//
//    }
//
//    public void pushGenap(int angkaGenap) {
//        if (angkaGenap % 2 == 0) {
//            if (numberGenap >= limitGenap) {
//                System.out.println("stack genap terisi penuh" + " index ke-" + numberGenap++);
//            } else {
//                topGenap = new node(angkaGenap, topGenap);
//                numberGenap++;
//            }
//        }
//    }
//
//    public void pushGanjil(int angkaGanjil) {
//        if (angkaGanjil % 2 != 0) {
//            if (numberGanjil >= limitGanjil) {
//                System.out.println("stack ganjil terisi penuh" + " index ke-" + numberGanjil++);
//            } else {
//                topGanjil = new node(angkaGanjil, topGanjil);
//                numberGanjil++;
//            }
//        }
//    }
//
//    public void popGanjil() {
//        topGanjil = topGanjil.getPointer();
//        numberGanjil-=1;
//
//        if(topGanjil == null) {
//            System.out.println("stack kosong euy!");
//            return;
//        }
//    }
//
//    public void popGenap() {
//        topGanjil = topGenap.getPointer();
//        numberGenap-=1;
//
//        if(topGenap == null) {
//            System.out.println("stack kosong euy!");
//            return;
//        }
//    }
//
//    public boolean isEmptyGanjil(){
//        return topGanjil == null;
//    }
//
//    public boolean isEmptyGenap(){
//        return topGenap == null;
//    }
//
//    public void printStackGanjil() {
//        System.out.println("Stack Ganjil:");
//        node current = topGanjil;
//        while (current != null) {
//            System.out.println(current.getData());
//            current = current.getPointer();
//        }
//    }
//
//    public void printStackGenap() {
//        System.out.println("Stack Genap:");
//        node current = topGenap;
//        while (current != null) {
//            System.out.println(current.getData());
//            current = current.getPointer();
//        }
//    }
//
//public static void main(String[] args) {
//    stackWarmUp x = new stackWarmUp();
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.pushGenap(4);
//    x.printStackGenap();
//    System.out.println("sekarang ganjil");
//    System.out.println("\n");
//    x.pushGanjil(3);
//    x.pushGanjil(7);
//    x.pushGanjil(7);
//    x.pushGanjil(7);
//    x.pushGanjil(7);
//    x.pushGanjil(7);
//    x.printStackGanjil();
//
//
//}
//}
//
