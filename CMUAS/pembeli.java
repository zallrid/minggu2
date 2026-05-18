package CMUAS;

public class pembeli {
    String namaPembeli;
    String noHp;
    int antrian;


    public pembeli(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    void tampilPembeli(){
        System.out.println( antrian + "\t\t" + namaPembeli + "\t" + noHp);
    }

}
