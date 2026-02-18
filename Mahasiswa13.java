class Mahasiswa{
    String nama;
    String nim;
    String kelas;
    String ipk;

    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void ubahIpk(String ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0){
            return "Kinerja baik";
        }else if(ipk >= 2.0){
            return "Kinerja kurang";
        }else {
            return "Kinerja tidak valid";
        }
    }

    public Mahasiswa(){
    }
}