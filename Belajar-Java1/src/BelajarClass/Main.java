package BelajarClass;

public class Main {
    public static void main(String[] args) {
        Square persegi = new Square();
        persegi.setSisi(5);
        System.out.println("Sisi persegi : " + persegi.getSisi());
        System.out.println("Luas persegi : " + persegi.getLuas());
        System.out.println("Keliling persegi : " + persegi.getKeliling() + "\n");

        System.out.println("======================================");
        Rectangle persegiPanjang = new Rectangle();
        persegiPanjang.setPanjangLebar(5, 10);
        System.out.println("Panjang persegiPanjang : " + persegiPanjang.getPanjang());
        System.out.println("Lebar persegiPanjang : " + persegiPanjang.getLebar());
        System.out.println("Luas persegiPanjang : "+ persegiPanjang.getLuas());
        System.out.println("Keliling persegiPanjang : " + persegiPanjang.getKeliling() + "\n");

        System.out.println("======================================");
        Circle lingkaran = new Circle();
        lingkaran.setJari(5);
        System.out.println("Jari lingkaran : " + lingkaran.getJari());
        System.out.println("Luas lingkaran : " + lingkaran.getLuas());
        System.out.println("Keliling lingkaran : " + lingkaran.getKeliling() + "\n");

        System.out.println("======================================");
        Eclipse oval = new Eclipse();
        oval.setMinorMayor(5, 10);
        System.out.println("Minor Axis oval : " + oval.getMinorAxis());
        System.out.println("Mayor Axis oval : " + oval.getMayorAxis());
        System.out.println("Luas oval : "+ oval.getLuas());
        System.out.println("Keliling oval : " + oval.getKeliling());
    }
}