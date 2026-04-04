public class Transaksi {
    private Pelanggan pelanggan;
    private PlayStation playStation;
    private int lamaSewa;

    Transaksi(Pelanggan pelanggan, PlayStation playStation, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.playStation = playStation;
        this.lamaSewa = lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    void tampilData() {
        int total = playStation.getHargaPerJam() * lamaSewa;

        System.out.println("===== DATA PENYEWAAN =====");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("No HP          : " + pelanggan.getNoHp());
        System.out.println("Tipe PS        : " + playStation.getTipePs());
        System.out.println("Harga per Jam  : Rp" + playStation.getHargaPerJam());
        System.out.println("Lama Sewa      : " + lamaSewa + " jam");
        System.out.println("----------------------------");
        System.out.println("Total Bayar    : Rp" + total);
    }
}