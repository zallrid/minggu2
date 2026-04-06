package praktikum06;

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
           m.ipk = Double.parseDouble(dummy);
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

 //pencarian menggunakan sequential
       list.tampil();
       System.out.println("-----------------------------------------------------------");
       System.out.println("Pencarian data");
       System.out.println("-----------------------------------------------------------");
       System.out.println("masukkan ipk mahasiswa yang dicari: ");
       System.out.print("IPK: ");
       String cariInput = sc.nextLine();
       double cari = Double.parseDouble(cariInput);

       System.out.println("-----------------------------------------------------------");
       System.out.println("menggunakan sequential searching");
       double posisi = list.sequentialSearching(cari);
       int pss= (int)posisi;
       list.tampilPosisi(cari, pss);
       list.tampilDataSearch(cari, pss);

       //pencarian menggunakan binary
       System.out.println("--------------------------------------------------------------");
       System.out.println("menggunakan binary searching");
       System.out.println("--------------------------------------------------------------");
       System.out.println("masukkan ipk mahasiswa yang dicari:");
       System.out.print("IPK: ");
       String cariinput = sc.nextLine();
       double carii = Double.parseDouble(cariinput);
       System.out.println("--------------------------------------------------------------");
       double posisis2 = list.findBinarySearch(carii, 0, list.idx-1);
       int pss2= (int)posisis2;
       list.tampilPosisi(carii, pss2);
       list.tampilDataSearch(carii, pss2);
   }
    }


