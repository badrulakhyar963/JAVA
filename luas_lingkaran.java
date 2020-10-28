//scanner digunakan untuk memasukkan nilai setelah program dijalankan
import java.util.Scanner;
public class luas_lingkaran {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
        //Deklarasi variabel
        double luas, phi=3.14;
        int r;
 
        //Input nilai jari-jari lingkaran
        System.out.print("Masukan Jari-jari : ");
        r=input.nextInt();
 
        // rumus menghitung luas lingkaran
        luas=phi*r*r;
        System.out.println("Luas Lingkaran = "+luas);
        //input.close(); digunakan untuk menutup input
        input.close();
     } 
}


