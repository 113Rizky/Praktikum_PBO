public class PlayStation {
    protected String tipePs;
    protected int hargaPerJam;

    PlayStation(String tipePs, int hargaPerJam) {
        this.tipePs = tipePs;
        this.hargaPerJam = hargaPerJam;
    }

    public String getTipePs() {
        return tipePs;
    }

    public int getHargaPerJam() {
        return hargaPerJam;
    }
}