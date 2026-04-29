package Praktikum10;

public class antrianKrs {
    krs[] data;
    int front;
    int rear; 
    int size;
    int max;
    int jumlahSelesaiKrs = 0;

    public antrianKrs(int max) {
        this.max = max;
        this.data = new krs[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(krs mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Maksimal antrian adalah 10 mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian KRS.");
    }

    
    public void prosesKrsDpa() {
        if (size < 2) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Proses KRS gagal: Minimal harus ada 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Memproses KRS untuk 2 mahasiswa terdepan...");
        for (int i = 0; i < 2; i++) {
            krs mhs = data[front];
            System.out.print("Selesai diproses: ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahSelesaiKrs++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("--------------------------------");
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("--------------------------------");
        System.out.println("Daftar Antrian KRS Saat Ini:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (size < 2) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Data tidak cukup untuk menampilkan 2 antrian terdepan.");
        } else {
            System.out.println("------------------------");
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatPalingAkhir() {
        if (!isEmpty()) {
            System.out.println("-----------------------");
            System.out.print("Antrian paling akhir: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("---------------------");
            System.out.println("Antrian kosong.");
        }
    }

    public void cetakStatistik() {
        int targetDpa = 30; 
        int sisaBelumKrs = targetDpa - jumlahSelesaiKrs;
        System.out.println("=== Statistik KRS ===");
        System.out.println("Jumlah dalam antrian saat ini : " + size);
        System.out.println("Total mahasiswa sudah KRS     : " + jumlahSelesaiKrs);
        System.out.println("Mahasiswa belum proses (Target): " + sisaBelumKrs);
    }
}
