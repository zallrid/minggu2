package CM;
import java.util.Scanner;

public class perpusDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        buku13 daftarBuku13 [] = new buku13[4];

        daftarBuku13[0] = new buku13("B001", "Algoritma",2020);
        daftarBuku13[1] = new buku13("B002", "Basis Data",2019);
        daftarBuku13[2] = new buku13("B003", "Pemograman",2021);
        daftarBuku13[3] = new buku13("B004", "Fisika",2024);


        mahasiswa13 dafMahasiswa13[] = new mahasiswa13[3];

        dafMahasiswa13[0] = new mahasiswa13("22001", "Andi", "Teknik Informatika");
        dafMahasiswa13[1] = new mahasiswa13("22002", "Budi", "Teknik Informatika");
        dafMahasiswa13[2] = new mahasiswa13("22003", "Citra", "Sistem Informasi Bisnis");

        peminjaman13 listPeminjaman13[] = new peminjaman13[5];

        listPeminjaman13 [0] = new peminjaman13(dafMahasiswa13[0], daftarBuku13[0], 7);
        listPeminjaman13 [1] = new peminjaman13(dafMahasiswa13[1], daftarBuku13[1], 3);
        listPeminjaman13 [2] = new peminjaman13(dafMahasiswa13[2], daftarBuku13[2], 10);
        listPeminjaman13 [3] = new peminjaman13(dafMahasiswa13[2], daftarBuku13[3], 6);
        listPeminjaman13 [4] = new peminjaman13(dafMahasiswa13[0], daftarBuku13[1], 4);

         do{
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BCA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Ururtkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-5): ");
            menu = sc.nextInt();
            sc.nextLine(); 

            System.out.println(); 

            switch (menu){
                case 1:
                    System.out.println("=== DAFTAR MAHASISWA ===");
                    for (mahasiswa13 mhs : dafMahasiswa13) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("=== DAFTAR BUKU ===");
                    for (buku13 buku : daftarBuku13) {
                        buku.tampilInfo();
                    }
                    break;
                case 3:
                    System.out.println("=== DAFTAR PEMINJAMAN ===");                    
                    for (peminjaman13 pinjam : listPeminjaman13) {
                        pinjam.hitungDenda();
                        pinjam.tampilPeminjaman();
                    }
                    break;
                case 4:
                    System.out.println("=== URUTKAN PEMINJAMAN BERDASARKAN DENDA ===");
                    for(int i = 0; i < listPeminjaman13.length - 1; i++) {
                        int idxMax = i;
                        for (int j= i+1; j < listPeminjaman13.length; j++) {
                            if (listPeminjaman13[j].denda > listPeminjaman13[idxMax].denda) {
                                idxMax = j;
                            }
                        }
                        peminjaman13 temp = listPeminjaman13[i];
                        listPeminjaman13[i] = listPeminjaman13[idxMax];
                        listPeminjaman13[idxMax] = temp;
                    }
                    for (peminjaman13 pinjam : listPeminjaman13) {
                        pinjam.hitungDenda();
                        pinjam.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    int posisi = -1;
                    for (int i = 0; i < listPeminjaman13.length; i++) {
                        if (listPeminjaman13[i].mhs.nim.equals(nim)) {
                            posisi = i;
                            break;
                        }
                    }
                    if (posisi != -1) {
                        listPeminjaman13[posisi].hitungDenda();
                        listPeminjaman13[posisi].tampilPeminjaman();
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
         } while (menu != 0);

         


        

        
    }
    
}
