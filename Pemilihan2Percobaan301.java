import java.util.Scanner;
public class Pemilihan2Percobaan301 {
    public static void main(String[] args) {
     Scanner input01 = new Scanner(System.in);

     String kategori;
     int penghasilan, gajiBersih;
     double pajak = 0;

     System.out.print("Masukkan Kategori: ");
     kategori = input01.nextLine();
     System.out.print("Masukkan Besarnya Penghasilan: ");
     penghasilan = input01.nextInt();

     if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000) 
        pajak = 0.1;
        else if (penghasilan <= 3000000) 
        pajak = 0.15;
        else    
            pajak = 0.2;
        gajiBersih = (int)  (penghasilan - (pajak*penghasilan));
        System.out.print("Pengahasilan Bersih: " + gajiBersih);
        
     }else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 2500000) 
        pajak = 0.15;
        else if (penghasilan <= 3500000) 
        pajak = 0.2;    
        else 
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak*penghasilan));
        System.out.print("Penghasilan Bersih: " +gajiBersih);
     }else
        System.out.println("Masukan Kategori Salah ");

        
input01.close();
    }
}