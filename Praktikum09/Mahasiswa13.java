package Praktikum09;

public class Mahasiswa13 {
 String nama;
 String nim;
 String kelas;
 int nilai = -1;
    Mahasiswa13(){

    }

    Mahasiswa13(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }  

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }

    
}
