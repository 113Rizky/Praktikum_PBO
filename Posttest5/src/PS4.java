public class PS4 extends PlayStation implements FiturPlayable {

    PS4() {
        super("PS4", 10000);
    }

    @Override
    public String getInfoKonsol() {
        return "PS4 cocok untuk rental hemat dan game populer.";
    }

    @Override
    public String kualitasGrafik() {
        return "Grafik HD";
    }

    @Override
    public void nyalakan() {
        System.out.println("PS4 sedang dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("PS4 sedang dimatikan.");
    }
}