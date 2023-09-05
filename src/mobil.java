public class mobil {
    String warna;
    int jumlah_pintu;
    float isi_tanki;


//    ciri-ciri getter dia pasti return dan methodnya tanpa void
    public String njipukwerno(){
        return warna;
    }

//    ciri-ciri setter dia make void dan terdapat argument didalam methodnya
    public void diwarnai(String wernone_mobil){
        warna = wernone_mobil;
    }

//        jika bentuk lain dari setter
//        public void diwarnai(warna){
//            this.warna = warna
//        }
//        this.warna itu buat ambil variabel global di bawah class mobil
//        kalo warna itu ambil variabel si argument

    public static int maju(int maju) {
        int majukedepan = 0;
        majukedepan = majukedepan + maju;
        return(majukedepan);
    }

    public static int mundur(int mundur){
        int mundurkebelakang = 0;
        mundurkebelakang = mundurkebelakang + mundur;
        return(mundurkebelakang);
    }

    public static void main(String[] args) {
        mobil mobilmu = new mobil();
        mobilmu.diwarnai("merah");
        System.out.println("mobilmu berwana " + mobilmu.njipukwerno());
    }

//    penjelasannya untuk nampilin getter kita harus menggunakan system.out.println karena getter itu return

}
