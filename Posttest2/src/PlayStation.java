public class PlayStation {
    private String tipePs;
    private int hargaPerJam;

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

    public void setTipePs(String tipePs) {
        this.tipePs = tipePs;
    }

    public void setHargaPerJam(int hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }
}