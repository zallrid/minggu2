package CMUAS;

public class nodeAntrian {
    pembeli data;
    nodeAntrian prev;
    nodeAntrian next;

    public nodeAntrian(pembeli data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
