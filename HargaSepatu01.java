import java.util.Scanner;

public class HargaSepatu01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike): ");
        String merk = input01.nextLine();

        String kategori = "";
        int ukuran = 0;
        int harga = 0;

        // Menentukan harga berdasarkan merk, kategori, dan ukuran
        if (merk.equalsIgnoreCase("Converse")) {
            System.out.print("Masukkan kategori sepatu (Slip On/High Top): ");
            kategori = input01.nextLine();
            System.out.print("Masukkan ukuran sepatu(36-40)(40-44): ");
            ukuran = input01.nextInt();

            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                }
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            System.out.print("Masukkan kategori sepatu (Woman/Man): ");
            kategori = input01.nextLine();
            System.out.print("Masukkan ukuran sepatu(36-41)(41-44): ");
            ukuran = input01.nextInt();

            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            System.out.print("Masukkan kategori sepatu (Kids/Adults): ");
            kategori = input01.nextLine();
            System.out.print("Masukkan ukuran sepatu(36-40)(40-44): ");
            ukuran = input01.nextInt();

            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            } else if (kategori.equalsIgnoreCase("Adults")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
            }
        } else {
            System.out.println("Merek tidak valid");
            return;
        }

        // Memeriksa apakah harga ditemukan
        if (harga == 0) {
            System.out.println("Kombinasi kategori dan ukuran tidak valid");
        } else {
            // Output merk, kategori, ukuran, dan harga sepatu
            System.out.println("Merk: " + merk);
            System.out.println("Kategori: " + kategori);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp." + harga);
        }
        input01.close();
    }
}