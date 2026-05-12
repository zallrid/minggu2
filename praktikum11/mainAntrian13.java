package praktikum11;

import java.util.Scanner;

public class mainAntrian13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedAntrian13 antrian = new linkedAntrian13();
        int pilihan;

        do {
            System.out.println("\n--- Layanan Unit Kemahasiswaan ---");
            System.out.println("1. Tambah Antrian (Daftar)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("------------------------");
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(nim, nama);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.displaySize();
                    break;
                case 5:
                    antrian.clear();
                    break;
            }
        } while (pilihan != 6);
        
        System.out.println("Selesai.");
        sc.close();
    }
}