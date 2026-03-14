package minggu5;

public class mainNilai {
  
    public static void main(String[] args) {
        nilai[] daftarMhs = new nilai[8];
        daftarMhs[0] = new nilai("Ahmad", 220101001, 2022, 78, 82);
        daftarMhs[1] = new nilai("Budi", 220101002, 2022, 85, 88);
        daftarMhs[2] = new nilai("Cindy", 220101003, 2021, 90, 87);
        daftarMhs[3] = new nilai("Dian", 220101004, 2021, 76, 79);
        daftarMhs[4] = new nilai("Eko", 220101005, 2023, 92, 95);
        daftarMhs[5] = new nilai("Fajar", 220101006, 2020, 88, 85);
        daftarMhs[6] = new nilai("Gina", 220101007, 2023, 80, 83);
        daftarMhs[7] = new nilai("Hadi", 220101008, 2020, 82, 84);

        operasiNilai op = new operasiNilai();

        System.out.println("Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer: " + op.cariMaxUTS(daftarMhs, 0, daftarMhs.length - 1));
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: " + op.cariMinUTS(daftarMhs, 0, daftarMhs.length - 1));
        System.out.println("Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force: " + op.rataUAS(daftarMhs));
    }
}

