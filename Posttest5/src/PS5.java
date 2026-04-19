public class PS5 extends PlayStation implements FiturPlayable {

    PS5() {
        super("PS5", 15000);
    }

    @Override
    public String getInfoKonsol() {
        return "PS5 cocok untuk performa tinggi dan game generasi terbaru.";
    }

    @Override
    public String kualitasGrafik() {
        return "Grafik 4K";
    }

    @Override
    public void nyalakan() {
        System.out.println("PS5 sedang dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("PS5 sedang dimatikan.");
    }
}