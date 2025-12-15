import java.util.Scanner;

public class AplikasiKasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaProduk;
        int jumlah, hargaSatuan, harga, hargaTotal;
        double diskon;

        System.out.print("Masukkan nama produk: ");
        namaProduk = scanner.next();

        System.out.print("Masukkan jumlah " + namaProduk + " yang dibeli: ");
        jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga Satuan " + namaProduk + ": ");
        hargaSatuan = scanner.nextInt();

        harga = jumlah * hargaSatuan;
        System.out.print("Total harga " + namaProduk + ": " + harga);

        if (harga > 1000000) {
            diskon = harga * 0.1;
            hargaTotal = harga - (int) diskon;
        } else if (harga > 500000 || harga >= 1000000) {
            diskon = harga * 0.05;
            hargaTotal = harga - (int) diskon;
        } else {
            diskon = harga * 0;
            hargaTotal = harga - (int) diskon;
        }

        System.out.print("\nDiskon: " + diskon);
        System.out.print("\nHarga yang harus dibayar untuk " + namaProduk + " adalah: " + hargaTotal);
    }
}