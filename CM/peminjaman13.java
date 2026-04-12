package CM;

public class peminjaman13 {
    mahasiswa13 mhs;
    buku13 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int denda = 0;


    public peminjaman13(mahasiswa13 m, buku13 b, int lama) {
        mhs = m;
        buku = b;
        lamaPinjam = lama;
    }

    void tampilPeminjaman(){
        System.out.println("Mahasiswa: " + mhs.nama);
        System.out.println("Buku: " + buku.judul);
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Denda: " + denda);
        System.out.println("----------------------------------");
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam){
            denda = (lamaPinjam - batasPinjam) * 2000;
        }else{
            denda = 0;
        }
    }

    
}
