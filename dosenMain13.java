public class dosenMain13 {
    public static void main(String[] args) {
        dosen13 dosen = new dosen13();
        dosen.idDosen = "D123";
        dosen.nama = "dityan.sp.sd.smp";
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2010;
        dosen.bidangKeahlian = "Agama kristen";

        dosen.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dosen.hitungMasaKerja(2024) + " tahun");
        dosen.setStatusAktif(false);
        dosen.ubahBidangKeahlian("Pemrograman Berorientasi Objek");
        dosen.tampilkanInformasi();

        dosen13 dosen2 = new dosen13();
        dosen2.idDosen = "D456";
        dosen2.nama = "Dr. Juan sosmomito.sp.sd.sma";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2015;
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2024) + " tahun");
        dosen2.bidangKeahlian = "Bahasa jawa";

        dosen2.tampilkanInformasi();

        dosen13 dosen3 = new dosen13();
        dosen3.idDosen = "D789";
        dosen3.nama = "Supratman S.kom";
        dosen3.statusAktif = true;
        dosen3.tahunBergabung = 2018;
        System.out.println("Masa Kerja : " + dosen3.hitungMasaKerja(2024) + " tahun");
        dosen3.bidangKeahlian = "Jaringan Komputer";

        dosen3.tampilkanInformasi();

        dosen13 dosen4 = new dosen13("D101", "ripek S.kom", true, 2023, "Matematika lanjut");
        dosen4.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dosen4.hitungMasaKerja(2024) + " tahun");
    }
    
}
