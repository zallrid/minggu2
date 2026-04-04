package Praktikum05;

public class mahasiswaBerprestasi13 {
    mahasiswa13[] listMhs = new mahasiswa13 [5];
    int idx;

    void tambah (mahasiswa13 m){
    if (idx<listMhs.length){
        listMhs[idx] = m;
        idx++;
    } else {
        System.out.println("Data sudah penuh");
    }
}

void tampil (){
    for (mahasiswa13 m:listMhs){
        m.tampilinformasi();
        System.out.println("-------------------");
    }
}

void bubleSort(){
    for (int i=0; i<listMhs.length-1; i++){
        for (int j=1; j<listMhs.length-i; j++){
            if (listMhs[j].ipk>listMhs[j-1].ipk){
                mahasiswa13 tmp = listMhs[j];
                listMhs[j]=listMhs[j-1];
                listMhs[j-1]=tmp;
            }
        }
    }
}
}


