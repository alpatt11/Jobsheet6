public class BilanganTerbesar01 {
    
    public static void main(String[] args) {
        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;
        int bilanganTerbesar;
        if (bil1 > bil2) {
            bilanganTerbesar = bil1;
        } else {
            bilanganTerbesar = bil2;
        }

        if (bilanganTerbesar < bil3) {
            bilanganTerbesar = bil3;
        }
        System.out.println("Bilangan terbesar: " + bilanganTerbesar);
    }

}
