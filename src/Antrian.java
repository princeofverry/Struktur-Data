public class Antrian {
    node frontGanjil;
    node frontGenap;
    node rearGanjil;
    node rearGenap;

    public Antrian(){
        frontGanjil = null;
        frontGenap = null;
        rearGanjil = null;
        rearGenap = null;
    }

    public void enqueue(int angka) {
        if(angka % 2 == 0) {
            if(rearGenap == null){
                frontGenap = new node(angka);
                rearGenap = frontGenap;
            } else {
                rearGenap.setPointer(new node(angka));
                rearGenap = rearGenap.getPointer();
            }
        } else {
            if(rearGanjil == null){
                frontGanjil = new node(angka);
                rearGanjil = frontGanjil;
            } else {
                rearGanjil.setPointer(new node(angka));
                rearGanjil = rearGanjil.getPointer();
            }
        }
    }

    public void dequeue(String x){
        if (x.equals("ganjil")){
            if(frontGanjil != null){
                frontGanjil = frontGanjil.getPointer();
                if(frontGanjil == null) {
                    rearGanjil = null;
                }
            } else {
                System.out.println("Ganjil kosong!");
            }
        } else {
            if(frontGenap != null) {
                frontGenap = frontGenap.getPointer();
                if(frontGenap == null){
                    rearGenap = null;
                }
            } else {
                System.out.println("Genap kosong!");
            }
        }
    }

    public static void main(String[] args) {
        Antrian a = new Antrian();
        a.enqueue(5);
        a.enqueue(2);
        a.enqueue(4);
        a.dequeue("ganjil");
        a.dequeue("genap");
        a.dequeue("ganjil");
    }
}
