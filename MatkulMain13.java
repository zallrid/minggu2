public class MatkulMain13 {
    public static void main(String[] args) {
        Matkul13 matkul = new Matkul13();
        matkul.kodeMK = "IF123";
        matkul.nama = "Algoritma dan Struktur Data";
        matkul.sks = 3;
        matkul.jumlahJam = 4;

        matkul.tampilkanInformasi();
        matkul.ubahSKS(4);
        matkul.tambahJam(1);
        matkul.kurangiJam(6);
        matkul.tampilkanInformasi();

        Matkul13 matkul2 = new Matkul13();
        matkul2.kodeMK = "IF456";
        matkul2.nama = "Pemrograman Berorientasi Objek";
        matkul2.sks = 4;
        matkul2.jumlahJam = 5;

        matkul2.tampilkanInformasi();

        Matkul13 matkul3= new Matkul13("IF998", "sistem operasi", 3, 5);
        matkul3.tampilkanInformasi();
    }
    
}
