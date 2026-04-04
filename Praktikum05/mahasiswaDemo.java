package Praktikum05;

public class mahasiswaDemo {
    public static void main(String[] args) {
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13();
        mahasiswa13 m1 = new mahasiswa13("123", "zidan", "2A", 3.2);
        mahasiswa13 m2 = new mahasiswa13("124", "ayu", "2A", 3.5);
        mahasiswa13 m3 = new mahasiswa13("125", "sofi", "2A", 3.1);
        mahasiswa13 m4 = new mahasiswa13("126", "sita", "2A", 3.9);
        mahasiswa13 m5 = new mahasiswa13("127", "miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();


        System.out.println("Data mahasiswa setelah soorting bedasarkan IPK (DESC): ");
        list.bubleSort();
        list.tampil();
    }
}
