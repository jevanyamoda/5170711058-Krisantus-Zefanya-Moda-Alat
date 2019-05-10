
package tugaspengganti;
import java.util.Scanner;

public class TugasPengganti {
static Scanner baca = new Scanner(System.in);
 static int ja,j;
 
   
    public static void main(String[] args) {
       
        AlatMandi Am = new AlatMandi();
        AlatTulis At = new AlatTulis();
        AlatKesehatan Ak = new AlatKesehatan();
        System.out.print("Jumlah Alat :");
        ja =baca.nextInt();
        System.out.println("1.AlatMandi");
        System.out.println("2.AlatTulis");
        System.out.println("3.AlatKesehatan");
        System.out.print("Jenis Alat :");
        j =baca.nextInt();
        System.out.println("");
        if(j == 1 ){
         
        for(int i=1; i <= ja ;i++){
           System.out.println("data barang ke-"+(i));
           Am.nama();
           Am.merk();
           Am.hargabeli();
           Am.Wujud();
           Am.Warna();
        }
            
        } 
        if(j == 2 ){
         
        for(int i=1; i <= ja ;i++){
           System.out.println("data barang ke-"+(i));
           At.nama();
           At.merk();
           At.hargabeli();
           At.Fungsi();
           At.dimensi();
        }
            
        }  
        if(j == 3 ){
         
        for(int i=1; i <= ja ;i++){
           System.out.println("data barang ke-"+(i));
           Ak.nama();
           Ak.merk();
           Ak.hargabeli();
           Ak.jenis();
           Ak.manfaat();
        }
            
        }  
    }
    
}
