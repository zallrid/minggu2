package CMUAS;

import java.util.Scanner;

public class main {

    public static pembeli inputPembeli(Scanner sc) {
        System.out.print("Masukkan Nama Pembeli: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan No HP: ");
        String noHp = sc.nextLine();
        return new pembeli( nama, noHp);
    }

    static pesanan inputPesanan(Scanner sc) {
        System.out.print("Kode Pesanan: ");
        int kode = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan: ");
        String nama = sc.nextLine();
        System.out.print("Harga Pesanan: ");
        int harga = sc.nextInt();
        sc.nextLine();
        pesanan pesan = new pesanan(kode, nama, harga);
        return pesan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methodPembeli listPembeli = new methodPembeli();
        methodPesanan listPesanan = new methodPesanan();
        listPembeli.addLast(new pembeli("Ainra", "08224500000"));
        listPembeli.addLast(new pembeli("Danra", "08224511111"));
        listPembeli.addLast(new pembeli("Sanri", "08224522222"));
        int pilihan;

        do {
            System.out.println("\n===== MENU TOKO =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    pembeli beli = inputPembeli(sc);
                    listPembeli.addLast(beli);
                    break;
                case 2:
                    listPembeli.cetakAntrian();
                    break;
                case 3:
                    beli = listPembeli.removeFirst();
                    pesanan pesan = inputPesanan(sc);
                    listPesanan.addLast(pesan);
                    System.out.println(beli.namaPembeli + " telah membeli " + pesan.namaBarang);
                    break;
                case 4:
                    listPesanan.sortNamaPesanan();
                    listPesanan.cetakAntrian();
                    System.out.println("Total Pendapatan: " + listPesanan.totalPembelian);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}
