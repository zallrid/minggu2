package Praktikum05;

import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        String dummy;
       for (int i=0; i < jumlah; i++){
        mahasiswa13 m = new mahasiswa13();
           System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
           System.out.print("NIM: ");
           m.nim = sc.nextLine();
           System.out.print("Nama: ");
           m.nama = sc.nextLine();
           System.out.print("Kelas: ");
           m.kelas = sc.nextLine();
           System.out.print("IPK: ");
           dummy = sc.nextLine();
           m.ipk = Float.parseFloat(dummy);
           list.tambah(m);
           System.out.println("------------------------------");
           
       }

       
       System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
       System.out.println("=================================");
       list.insertionSort();
       list.tampil();
       System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
       System.out.println("=================================");
       list.selectionSort();
       list.tampil();
    }
}
