import java.util.Scanner;

public class ParkirKendaran24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("1 Mobil, 2 Motor, 0 Keluar: ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {  
                    total += durasi * 3000;
                } else if (jenis == 2) {  
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }

        System.out.println("Total pembayaran parkir: Rp " + total);

        input.close();
    }
}