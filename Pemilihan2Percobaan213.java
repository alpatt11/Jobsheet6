import java.util.Scanner;
public class Pemilihan2Percobaan213 {
    
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int pilihan_menu;
        String member, jenisPembayaran;
        double diskon, harga, totalBayar;
        double potonganQris = 1000.0;
        

        System.out.println("--------------------------------------");
        System.out.println("=========== MENU KAFE JTI ===========");
        System.out.println("--------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input01.nextInt();
        input01.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = input01.nextLine();
        System.out.print("Jenis Pembayaran (cash/Qris) = ");
        jenisPembayaran = input01.nextLine();
        System.out.println("--------------------------------------");


        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);    
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }


        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga RIcebowl = " + harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga;
            System.out.println(" Total bayar = " + totalBayar);

        }else{
            System.out.println("Member tidak valid");
            return;
        }

        if (jenisPembayaran.equalsIgnoreCase("Qris")) {
            totalBayar -= potonganQris;
            System.out.println("Potongan harga Qris = Rp. 1.000"); 
            System.out.println("Total Bayar setelah potongan Qris = " + totalBayar);  
        }
        
        System.out.println("--------------------------------------");




    input01.close();
    }
}