package CM;

public class mahasiswa13 {
    String nama;
    String nim;
    String prodi;

    mahasiswa13(){

    }

    mahasiswa13(String nm, String n, String p){
        nama = n;
        nim = nm;
        prodi = p;
    }

    void tampilMahasiswa(){
        System.out.println("Nama         : "+ nama);
        System.out.println("NIM          : "+ nim);
        System.out.println("Program Studi: "+ prodi);
        System.out.println("----------------------------------");
    }
}
