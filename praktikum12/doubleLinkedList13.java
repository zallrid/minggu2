package praktikum12;

public class doubleLinkedList13 {
    node13 head;
    node13 tail;

    public doubleLinkedList13(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    void addFirst(mahasiswa13 data){
        node13 newNode = new node13(data);
        if (isEmpty()){
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
}
