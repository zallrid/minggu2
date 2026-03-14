package minggu5;

public class operasiNilai {
    
    int cariMaxUTS(nilai[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMaxUTS(mhs, l, mid);
        int kanan = cariMaxUTS(mhs, mid + 1, r);
        return (kiri > kanan) ? kiri : kanan;
    }

    int cariMinUTS(nilai[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMinUTS(mhs, l, mid);
        int kanan = cariMinUTS(mhs, mid + 1, r);
        return (kiri < kanan) ? kiri : kanan;
    }

    double rataUAS(nilai[] mhs) {
        double total = 0;
        for (nilai m : mhs) {
            total += m.nilaiUAS;
        }
        return total / mhs.length;
    }
}

