package Praktikum09;

public class stackSurat13 {
    surat13[] stack;
    int size, top;

    public stackSurat13(int size) {
        this.size = size;
        stack = new surat13[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat13 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public surat13 pop() {
        if (!isEmpty()) {
            surat13 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("--------------------------------------");
            System.out.println("Surat teratas: " + stack[top].namaMahasiswa + " [" + stack[top].idSurat + "]");
        } else {
            System.out.println("Stack kosong!");
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("--------------------------------------");
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + stack[i].idSurat   );
                System.out.println("Jenis: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ketemu = true;
                break;
            }
        }
        if (!ketemu) System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
    }
}