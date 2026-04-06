package praktikum06;

public class mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa13(){

    }

    mahasiswa13(String nm, String name, String kls, double ip){
        nim=nm;
        nama=name;
        ipk=ip;
        kelas=kls;
    }

    void tampilinformasi(){
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.printf("IPK: %.2f\n ", ipk);
    }
    
}





