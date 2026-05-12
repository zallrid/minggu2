package praktikum11;

public class mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa13(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama+ "\t" + nim + "\t" + kelas + "\t" + ipk); 
    }

}
