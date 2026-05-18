package CMUAS;

public class pesanan {
    int kodePesanan;
    String namaBarang;
    int harga;

    public pesanan(int kodePesanan, String namaBarang, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    void tampilPesanan() {
        System.out.println(
            kodePesanan + "\t\t"+ namaBarang + "\t"+ harga);
    }

}
