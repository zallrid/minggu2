package minggu5;
import java.util.Scanner;

public class mainSum {
public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();


    sum sm = new sum(elemen);

    for (int i=0; i<elemen; i++){
        System.out.print("Masukan keuntungan nke-"+(i+1)+":");
        sm.keuntungan[i] = input.nextDouble();
    }

    System.out.println("Total keuntungan menggunkaan Bruteforce: "+sm.totalBF());
    System.out.print("Total keuntungan menggunakan DIvide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen - 1));
    
}
}