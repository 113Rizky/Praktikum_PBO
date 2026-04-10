public class Transaksi {
    private Pelanggan pelanggan;
    private PlayStation playStation;
    private int lamaSewa;
    private int diskon;

    Transaksi(Pelanggan pelanggan, PlayStation playStation, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.playStation = playStation;
        this.lamaSewa = lamaSewa;
        this.diskon = 0;
    }

    Transaksi(Pelanggan pelanggan, PlayStation playStation, int lamaSewa, int diskon) {
        this.pelanggan = pelanggan;
        this.playStation = playStation;
        this.lamaSewa = lamaSewa;
        this.diskon = diskon;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public int hitungTotal() {
        return playStation.getHargaPerJam() * lamaSewa;
    }

    public int hitungTotal(int diskon) {
        return (playStation.getHargaPerJam() * lamaSewa) - diskon;
    }

    void tampilData() {
        int total;

        if (diskon > 0) {
            total = hitungTotal(diskon);
        } else {
            total = hitungTotal();
        }

        System.out.println("===== DATA PENYEWAAN =====");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("No HP          : " + pelanggan.getNoHp());
        System.out.println("Tipe PS        : " + playStation.getTipePs());
        System.out.println("Harga per Jam  : Rp" + playStation.getHargaPerJam());
        System.out.println("Lama Sewa      : " + lamaSewa + " jam");
        System.out.println("Info Konsol    : " + playStation.getInfoKonsol());
        System.out.println("Diskon         : Rp" + diskon);
        System.out.println("----------------------------");
        System.out.println("Total Bayar    : Rp" + total);
    }
}