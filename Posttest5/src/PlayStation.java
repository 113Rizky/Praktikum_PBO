public abstract class PlayStation {
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

    public String getInfoKonsol() {
        return "Konsol PlayStation untuk disewa.";
    }

    public abstract String kualitasGrafik();
}