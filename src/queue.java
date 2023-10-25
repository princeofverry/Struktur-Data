//
//
//class QueueWarmUp {
//    node frontGanjil;
//    node rearGanjil;
//    node frontGenap;
//    node rearGenap;
//
//    int limitGenap = 10;
//    int limitGanjil = 15;
//
//    public QueueWarmUp() {
//        frontGanjil = null;
//        rearGanjil = null;
//        frontGenap = null;
//        rearGenap = null;
//    }
//
//    public void enqueueGenap(int angkaGenap) {
//        if (angkaGenap % 2 == 0) {
//            if (rearGenap == null) {
//                frontGenap = new node(angkaGenap, null);
//                rearGenap = frontGenap;
//            } else {
//                rearGenap.setPointer(new node(angkaGenap, null));
//                rearGenap = rearGenap.getPointer();
//            }
//        }
//    }
//
//    public void enqueueGanjil(int angkaGanjil) {
//        if (angkaGanjil % 2 != 0) {
//            if (rearGanjil == null) {
//                frontGanjil = new node(angkaGanjil, null);
//                rearGanjil = frontGanjil;
//            } else {
//                rearGanjil.setPointer(new node(angkaGanjil, null));
//                rearGanjil = rearGanjil.getPointer();
//            }
//        }
//    }
//
//    public void dequeueGanjil() {
//        if (frontGanjil != null) {
//            frontGanjil = frontGanjil.getPointer();
//            if (frontGanjil == null) {
//                rearGanjil = null;
//            }
//        } else {
//            System.out.println("Antrian ganjil kosong!");
//        }
//    }
//
//    public void dequeueGenap() {
//        if (frontGenap != null) {
//            frontGenap = frontGenap.getPointer();
//            if (frontGenap == null) {
//                rearGenap = null;
//            }
//        } else {
//            System.out.println("Antrian genap kosong!");
//        }
//    }
//
//    public boolean isEmptyGanjil() {
//        return frontGanjil == null;
//    }
//
//    public boolean isEmptyGenap() {
//        return frontGenap == null;
//    }
//
//    public void printQueueGanjil() {
//        System.out.println("Antrian Ganjil:");
//        node current = frontGanjil;
//        while (current != null) {
//            System.out.println(current.getData());
//            current = current.getPointer();
//        }
//    }
//
//    public void printQueueGenap() {
//        System.out.println("Antrian Genap:");
//        node current = frontGenap;
//        while (current != null) {
//            System.out.println(current.getData());
//            current = current.getPointer();
//        }
//    }
//
//    public static void main(String[] args) {
//        QueueWarmUp x = new QueueWarmUp();
//        x.enqueueGanjil(3);
//        x.enqueueGanjil(5);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(7);
//        x.enqueueGanjil(9);
//
//        x.enqueueGenap(6);
//        x.enqueueGenap(8);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(4);
//        x.enqueueGenap(8);
//        x.enqueueGenap(48);
//        x.dequeueGenap();
//
//
//
//        x.printQueueGanjil();
//
//        x.printQueueGenap();
//    }
//}
