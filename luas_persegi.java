//scanner digunakan untuk memasukkan nilai setelah program dijalankan
import java.util.Scanner;

public class luas_persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int sisi, luas;
    
        //input nilai sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextInt();

        //rumus mengitung luas persegi
        luas = sisi * sisi;
        System.out.println("Luas Persegi adalah " + luas);
        //input.close(); digunakan untuk menutup input  
        input.close();     
    }    
}
