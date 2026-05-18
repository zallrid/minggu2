package CMUAS;

public class methodPesanan {
    nodePesanan head;
    nodePesanan tail;
    int size;
    int totalPembelian = 0;

    public methodPesanan(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    void addLast(pesanan data) {
        nodePesanan newNode = new nodePesanan(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++;
            totalPembelian += data.harga;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            totalPembelian += data.harga;
            size++;
        }
    }

    void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        System.out.println("-----------------------");
        System.out.println("Laporan Pesanan (Urut Nama Pesanan)");
        System.out.println("No Pesanan\tNama\tHarga");
        nodePesanan current = head;
        while (current != null) {
            current.data.tampilPesanan();
            current = current.next;
        }
    }

    public void sortNamaPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;
        do {
            tukar = false;
            nodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaBarang.compareToIgnoreCase(current.next.data.namaBarang) > 0) {
                    pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
        System.out.println("Data yang dihapus:");
        head.data.tampilPesanan();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
}
