public class Matkul13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

     void tampilkanInformasi(){
        System.out.println("KodeMk : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    
    void ubahSKS (int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jamBaru){
        jumlahJam += jamBaru;
    }

    void kurangiJam(int jamKurang){
        if (jumlahJam - jamKurang >= 0) {
            jumlahJam -= jamKurang;
        } else {
            System.out.println("jumlah jam awal lebih kecil dari jam pengurang");
        }
    }

    public Matkul13(){
    }

    public Matkul13(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
