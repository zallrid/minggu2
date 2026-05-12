package praktikum11;

import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLingkedList13 sll = new singleLingkedList13();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("===================");
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa13 mhs = new mahasiswa13(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        
        System.out.println();
        sll.print();

        // --- Tambahan Pemanggilan Method Percobaan 2 ---
        
        System.out.print("\nMasukkan index yang ingin dilihat datanya: ");
        int idx = sc.nextInt();
        sc.nextLine();
        System.out.println("Data index " + idx + ": ");
        sll.getData(idx); // Memanggil getData

        System.out.print("\nMasukkan nama mahasiswa yang ingin dicari indexnya: ");
        String cari = sc.nextLine();
        System.out.println("Data mahasiswa bernama " + cari + " berada pada index: " + sll.indexOf(cari)); // Memanggil indexOf

        System.out.println("\n--- Menghapus Data Pertama dan Terakhir ---");
        sll.removeFirst(); // Memanggil removeFirst
        sll.removeLast();  // Memanggil removeLast
        sll.print();

        System.out.print("\nMasukkan index data yang ingin dihapus: ");
        int hapusIdx = sc.nextInt();
        sll.removeAt(hapusIdx); // Memanggil removeAt
        
        System.out.println("\n--- Isi Linked List Setelah Penghapusan ---");
        sll.print();
        
        sc.close();
    }
}