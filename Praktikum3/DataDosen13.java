package Praktikum3;

public class DataDosen13 {

    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("===== DATA SEMUA DOSEN =====");
        for (Dosen13 d : arrayOfDosen) {
            d.tampilkanInformasi();
            System.out.println("----------------------------");
            System.out.println();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen13 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen13 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0)
            System.out.println("Rata-rata usia Pria   : " + (double) totalPria / jumlahPria);

        if (jumlahWanita > 0)
            System.out.println("Rata-rata usia Wanita : " + (double) totalWanita / jumlahWanita);
    }

    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 tertua = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i];
            }
        }
        System.out.println();
        System.out.println("===== DOSEN PALING TUA =====");
        tertua.tampilkanInformasi();
    }

    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 termuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i];
            }
        }

        System.out.println("===== DOSEN PALING MUDA =====");
        termuda.tampilkanInformasi();
    }
}