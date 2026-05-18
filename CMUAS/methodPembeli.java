package CMUAS;

public class methodPembeli {
    nodeAntrian head;
    nodeAntrian tail;
    int size;
    int antrian;
    

    public methodPembeli(){
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

    void addLast(pembeli data) {
        nodeAntrian newNode = new nodeAntrian(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++;
            antrian++;
            newNode.data.antrian = antrian;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            antrian++;
            newNode.data.antrian = antrian;
        }
        System.out.println("Antrian berhasil ditambahkan dengan no: " + antrian);
    }

    void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        nodeAntrian current = head;
        System.out.println("-----------------------");
        System.out.println("Daftar Antrian");
        System.out.println("No antrian\tNama\tNoHP");
        while (current != null) {
            current.data.tampilPembeli();
            current = current.next;
        }
    }

    pembeli removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return null;
        }

        pembeli ant = head.data;
        if (head == tail) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        return ant;
    }
}
