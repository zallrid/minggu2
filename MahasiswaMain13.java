import javax.xml.crypto.MarshalException;

public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa mhsl = new Mahasiswa();
        mhsl.nama = "Mohamad Ali";
        mhsl.nim = "234567898";
        mhsl.kelas = "SI-2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI-2K");
        mhsl.ubahIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa ("Annisa Nabila","2141720106",3.25, "TI 2L");
        mhs2.ubahIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
