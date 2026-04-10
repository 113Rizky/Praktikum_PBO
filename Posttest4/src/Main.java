import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\n===== SISTEM PENYEWAAN PLAYSTATION =====");
            System.out.println("1. Tambah Penyewaan");
            System.out.println("2. Lihat Data Penyewaan");
            System.out.println("3. Update Lama Sewa");
            System.out.println("4. Hapus Data Penyewaan");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahPenyewaan();
                    break;
                case 2:
                    lihatPenyewaan();
                    break;
                case 3:
                    updatePenyewaan();
                    break;
                case 4:
                    hapusPenyewaan();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 5);
    }

    static void tambahPenyewaan() {
        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("No HP : ");
        String noHp = input.nextLine();

        System.out.println("Pilih Tipe PS:");
        System.out.println("1. PS4 (Rp10.000/jam)");
        System.out.println("2. PS5 (Rp15.000/jam)");
        System.out.print("Pilih : ");
        int pilihPs = input.nextInt();
        input.nextLine();

        PlayStation playStation;

        if (pilihPs == 1) {
            playStation = new PS4();
        } else if (pilihPs == 2) {
            playStation = new PS5();
        } else {
            System.out.println("Pilihan tidak valid, default PS4");
            playStation = new PS4();
        }

        System.out.print("Mau sewa berapa jam? : ");
        int lamaSewa = input.nextInt();
        input.nextLine();

        System.out.print("Apakah ada diskon? (y/n) : ");
        String pilihanDiskon = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, noHp);
        Transaksi transaksi;

        if (pilihanDiskon.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jumlah diskon : ");
            int diskon = input.nextInt();
            input.nextLine();
            transaksi = new Transaksi(pelanggan, playStation, lamaSewa, diskon);
        } else {
            transaksi = new Transaksi(pelanggan, playStation, lamaSewa);
        }

        daftarTransaksi.add(transaksi);
        System.out.println("Data penyewaan berhasil ditambahkan");
    }

    static void lihatPenyewaan() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Data penyewaan masih kosong");
        } else {
            for (int i = 0; i < daftarTransaksi.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                daftarTransaksi.get(i).tampilData();
                System.out.println("--------------------------");
            }
        }
    }

    static void updatePenyewaan() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Data penyewaan masih kosong");
        } else {
            lihatPenyewaan();
            System.out.print("Pilih nomor data yang ingin diupdate : ");
            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarTransaksi.size()) {
                System.out.print("Masukkan lama sewa baru (jam) : ");
                int lamaBaru = input.nextInt();
                input.nextLine();

                daftarTransaksi.get(index - 1).setLamaSewa(lamaBaru);
                System.out.println("Data penyewaan berhasil diupdate");
            } else {
                System.out.println("Nomor data tidak valid");
            }
        }
    }

    static void hapusPenyewaan() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Data penyewaan masih kosong");
        } else {
            lihatPenyewaan();
            System.out.print("Pilih nomor data yang ingin dihapus : ");
            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarTransaksi.size()) {
                daftarTransaksi.remove(index - 1);
                System.out.println("Data penyewaan berhasil dihapus");
            } else {
                System.out.println("Nomor data tidak valid");
            }
        }
    }
}