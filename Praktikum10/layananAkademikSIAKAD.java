package Praktikum10;
import java.util.Scanner;

public class layananAkademikSIAKAD {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    antrianLayanan antrian = new antrianLayanan(5);
    int pilihan;

    do{
        System.out.println("\n=== Menu Antiran Layanan Akademik ===");
        System.out.println("1. Tambah mahasiswa ke antrian");
        System.out.println("2. Layani mahasiswa");
        System.out.println("3. Lihat mahasiswa terdepan");
        System.out.println("4. Lihat semua antrian");
        System.out.println("5. Jumlah mahasiswa dalam antrian");
        System.out.println("6. Cek antrian paling belakang");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt(); 
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("Prodi: ");
                String prodi = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                mahasiswa mhs = new mahasiswa (nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;

            case 2:
                mahasiswa dilayani = antrian.layaniMahasiswa();
                if(dilayani != null) {
                    System.out.println("Melayani mahasiswa: ");
                    dilayani.tampilkanData();
                }
                break;

            case 3:
                antrian.lihatTerdepan();
                break;

            case 4:
                antrian.tampilkanSemua();
                break;

            case 5:
                System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                break;

            case 6:
                antrian.lihatAkhir();
                break;

            case 0:
                System.out.println("Terima kasih!");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }


    }while (pilihan != 0);
    sc.close();
}
}
