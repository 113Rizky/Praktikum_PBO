public class Transaksi {
    Pelanggan pelanggan;
    PlayStation playStation;
    int lamaSewa;

    Transaksi(Pelanggan pelanggan, PlayStation playStation, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.playStation = playStation;
        this.lamaSewa = lamaSewa;
    }

    void tampilData() {
        int total = playStation.hargaPerJam * lamaSewa;

        System.out.println("===== DATA PENYEWAAN =====");
        System.out.println("Nama Pelanggan : " + pelanggan.nama);
        System.out.println("No HP          : " + pelanggan.noHp);
        System.out.println("Tipe PS        : " + playStation.tipePs);
        System.out.println("Harga per Jam  : Rp" + playStation.hargaPerJam);
        System.out.println("Lama Sewa      : " + lamaSewa + " jam");
        System.out.println("----------------------------");
        System.out.println("Total Bayar    : Rp" + total);
    }
}