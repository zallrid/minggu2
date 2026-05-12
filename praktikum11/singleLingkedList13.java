package praktikum11;

public class singleLingkedList13 {
    nodeMahasiswa13 head;
    nodeMahasiswa13 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            nodeMahasiswa13 tmp = head;
            System.out.println("Isi linked list:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(mahasiswa13 input) {
        nodeMahasiswa13 ndInput = new nodeMahasiswa13(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(mahasiswa13 input) {
        nodeMahasiswa13 ndInput = new nodeMahasiswa13(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter (String key, mahasiswa13 input){
        nodeMahasiswa13 ndInput = new nodeMahasiswa13(input, null);
        nodeMahasiswa13 temp = head;
        do{
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }

    void insertAt (int index, mahasiswa13 input){
        if (index < 0){
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        }else{
            nodeMahasiswa13 temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa13(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    void getData (int index){
        nodeMahasiswa13 tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key){
        nodeMahasiswa13 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        } else {
            return index;
        }
    }


    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else if (head == tail){
            head = tail = null;
        } else {
            nodeMahasiswa13 temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove (String key){
        if (isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else{
            nodeMahasiswa13 temp = head;
            while (temp != null){
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                        this.removeFirst();
                        break;
                    } else if ((temp.data.nama.equalsIgnoreCase(key))){
                        temp.next = temp.next.next;
                         if (temp.next == null){
                            tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index){
        if (index == 0){
            removeFirst();
        }else {
            nodeMahasiswa13 temp = head;
            for (int i = 0; i< index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }


}
