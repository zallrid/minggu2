package CM;

public class buku13 {
    String judul;
    int tahunTerbit;
    String kodeBuku;

    buku13(){

    }

    buku13(String kd,String jdl, int thn){
        judul = jdl;
        tahunTerbit = thn;
        kodeBuku = kd;
    }

    void tampilInfo(){
        System.out.println("Judul       : "+ judul);
        System.out.println("Tahun Terbit: "+ tahunTerbit);
        System.out.println("Kode Buku   : "+ kodeBuku);
        System.out.println("----------------------------------");

    }
}


