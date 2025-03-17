public class Main {
    public static void main(String[] args) throws Exception {
        
        // buat vektor baru
        Vector3 vektor1 = new Vector3(4, 6, 2);
        Vector3 vektor2 = new Vector3(2, 10, 3);


        // display vektor sebelum perhitungan
        System.out.println("==Vektor==");
        vektor1.display();
        vektor2.display();

        // setelah perhitungan skalar
        Vector3 vektor1New = vektor1.perkalian(3);
        Vector3 vektor2New = vektor2.perkalian(2);
        System.out.println("\nVektor setelah perhitungan skalar");
        vektor1New.display();
        vektor2New.display();

        // perhitungan 2 vektor
        System.out.println("\nPerkalian 2 Vektor");
        int vektorMult = vektor1.perkalian(vektor2);
        System.out.println(vektorMult);
    }
}
