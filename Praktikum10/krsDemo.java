package Praktikum10;
import java.util.Scanner;

public class krsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKrs antrian = new antrianKrs(10); // Kapasitas maksimal 10 [cite: 1253]
        int pilihan;

        do {
            System.out.println("\n=== Sistem Antrian KRS DPA ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Statistik KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------");
                    System.out.print("NIM   : "); 
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : "); 
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new krs(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKrsDpa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatPalingAkhir();
                    break;
                case 6:
                    antrian.cetakStatistik();
                    break;
                case 0:
                    System.out.println("Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
