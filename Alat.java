
package tugaspengganti;

import java.util.Scanner;
public class Alat {
    Scanner baca = new Scanner(System.in);
    int HB;
    String merk,NB;
    void nama(){
        System.out.print("Nama Barang :");
        NB =baca.next();
    }
     void merk(){
        System.out.print("Merk Barang :");
        merk =baca.next();
    }
    void hargabeli(){
        System.out.print("Harga Beli :"); 
        HB =baca.nextInt();
    }
   
}
