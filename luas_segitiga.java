//scanner digunakan untuk memasukkan nilai setelah program dijalankan
import java.util.Scanner;
public class luas_segitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //deklarasi variable
        int a, t;
        double luas;
        
        //input nilai alas
        System.out.print("Masukan Alas : ");
        a=input.nextInt();
        //input nilai tinggi
        System.out.print("Masukan Tinggi : ");
        t=input.nextInt();
        
        //rumus menghitung luas segitiga
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
        //input.close(); digunakan untuk menutup input
        input.close();
    }      
}
