public class Koleksi {
    private String judul;
    private String penerbit;
    private int tahun;

    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public String toString() {
        return "Judul: " + judul + ", Penerbit: " + penerbit + ", Tahun: " + tahun;
    }

    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java", "Damar", "Informatika", 2025);
        Majalah majalah = new Majalah("Teknologi AI", "Edisi 10", "DamarPeditokkk", 2023);
        Skripsi skripsi = new Skripsi("230810140", "Saipul", "Machine Learning", "UPN euy", 2024);

        System.out.println("=== Data Koleksi ===");
        System.out.println(buku);
        System.out.println(majalah);
        System.out.println(skripsi);
    }
}
