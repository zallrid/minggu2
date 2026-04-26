package Praktikum09;

import java.util.Scanner;

public class suratDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat13 st = new stackSurat13(10);
        int pilih;

        do {
            System.out.println("");
            System.out.println("================================");
            System.out.println("Menu Layanan Surat Izin:");
            System.out.println("================================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    st.push(new surat13(id, nama, kls, jns, dur));
                    break;
                case 2:
                    surat13 s = st.pop();
                    if (s != null) System.out.println("Memproses surat milik: " + s.namaMahasiswa);
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    st.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}