public class App {
    public static void main(String[] args) throws Exception {
        Tabung tabung1 = new Tabung();

        // Mengatur nilai radius dan tinggi
        tabung1.setRadius(7);
        tabung1.setTinggi(10);

        // Menghitung volume
        tabung1.computeAndSetVolume();

        // Menampilkan volume tabung
        System.out.println("Volume Tabung: " + tabung1.getVolume());
    }
}
