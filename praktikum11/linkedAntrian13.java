package praktikum11;

public class linkedAntrian13 {
    antrian13 head, tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null; 
    }

    public void enqueue(String nim, String nama) {
        antrian13 baru = new antrian13(nim, nama);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println("------------------------");
        System.out.println(nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("------------------------");
            System.out.println("Antrian masih kosong!"); 
        } else {
            System.out.println("----------------------------");
            System.out.println("Memanggil antrian: " + head.nama + " (" + head.nim + ")");
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("------------------------");
            System.out.println("Antrian terdepan: " + head.nama); 
            System.out.println("Antrian terakhir: " + tail.nama); 
        } else {
            System.out.println("------------------------");
            System.out.println("Antrian kosong.");
        }
    }

    public void displaySize() {
        System.out.println("---------------------------------");
        System.out.println("Jumlah mahasiswa dalam antrian: " + size); 
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("----------------------------");
        System.out.println("Antrian telah dikosongkan."); 
    }
}