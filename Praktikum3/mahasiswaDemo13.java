package Praktikum3;

public class mahasiswaDemo13 {
    public static void main(String[] args) {
        mahasiswaa13[] mahasiswa = new mahasiswaa13[3];
        mahasiswaa13[] arrayOfMahasiswa = new mahasiswaa13[3];
        arrayOfMahasiswa[0] = new mahasiswaa13();
        arrayOfMahasiswa[0].nim = "2541070564";
        arrayOfMahasiswa[0].nama = "Joni";
        arrayOfMahasiswa[0].kelas = "SIB-ic";
        arrayOfMahasiswa[0].ipk = (float) 3.8;

        arrayOfMahasiswa[1] = new mahasiswaa13();
        arrayOfMahasiswa[1].nim = "2541070577";
        arrayOfMahasiswa[1].nama = "aya";
        arrayOfMahasiswa[1].kelas = "SIB-2b";
        arrayOfMahasiswa[1].ipk = (float) 3.2;

        arrayOfMahasiswa[2] = new mahasiswaa13();
        arrayOfMahasiswa[2].nim = "2541070545";
        arrayOfMahasiswa[2].nama = "Winarto";
        arrayOfMahasiswa[2].kelas = "SIB-2f";
        arrayOfMahasiswa[2].ipk = (float) 3.45;


        System.out.println("NIM    : "+ arrayOfMahasiswa[0].nim);
        System.out.println("Nama   : "+ arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------");
          System.out.println("NIM    : "+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama   : "+ arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("------------------------------");
          System.out.println("NIM    : "+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama   : "+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("------------------------------");

    }
}
