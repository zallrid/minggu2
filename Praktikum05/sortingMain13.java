package Praktikum05;

public class sortingMain13 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        sorting13 dataurut1 = new sorting13(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesprt();
        System.out.println("Data sudah diurutkan dengan BUBLE SORT (ASC)");
        dataurut1.tampil();

        sorting13 dataurut2 = new sorting13(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

    }
}
