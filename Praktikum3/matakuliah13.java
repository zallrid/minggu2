package Praktikum3;

class matakuliah13 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    matakuliah13(){
    }

   void tambahData(String kd, String nm, int sk, int jmJam){
    kode = kd;
    nama = nm;
    this.sks = sk;
    this.jumlahJam = jmJam;
   }

    //construktor dengan parameter
    public matakuliah13 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
