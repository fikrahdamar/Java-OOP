public class App {
    public static void main(String[] args) throws Exception {
        // tanpa constructor
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(10);
        kubus1.computeAndSetVolume();
        System.out.println("Volume kubus1 : " + kubus1.getVolume());
        // pakai constructor
        Kubus kubus2 = new Kubus(5);;
        kubus2.computeAndSetVolume();
        System.out.println("Volume kubus 2 (constructor) : " + kubus2.getVolume() + "\n");

        System.out.println("======================================");
        // tanpa constructor
        Balok balok1 = new Balok();
        balok1.setPanjang(5);
        balok1.setLebar(3);
        balok1.setTinggi(7);
        balok1.computeAndSetVolume();
        System.out.println("Volume balok1 : " + balok1.getVolume());
        // pakai constructor
        Balok balok2 = new Balok(7, 6, 5);
        balok2.computeAndSetVolume();
        System.out.println("Volume balok 2 (constructor) : " + balok2.getVolume() + "\n");

        System.out.println("======================================");
        // tanpa constructor
        Tabung tabung1 = new Tabung();
        tabung1.setRadius(5);
        tabung1.setTinggi(10);
        tabung1.computeAndSetVolume();
        System.out.println("Volume tabung : " + tabung1.getVolume());
        // pakai constructor
        Tabung tabung2 = new Tabung( 10, 5);
        tabung2.computeAndSetVolume();
        System.out.println("Volume tabung 2 (constructor) : " + tabung2.getVolume() + "\n");

        System.out.println("======================================");
        // tanpa constructor
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        limasSegiEmpat1.setSisi(10);
        limasSegiEmpat1.setTinggi(8);
        limasSegiEmpat1.computeAndSetVolume();
        System.out.println("Volume limas Segi Empat : " + limasSegiEmpat1.getVolume());
        // pakai constructor
        LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat(5, 10);
        LimasSegiEmpat2.computeAndSetVolume();
        System.out.println("Volume limas Segi Empat 2 (constructor) : " + LimasSegiEmpat2.getVolume() + "\n" );

        System.out.println("======================================");
        // tanpa constructor
        Bola bola1= new Bola();
        bola1.setRadius(14);
        bola1.computeAndSetVolume();
        System.out.println("Volume bola : " + bola1.getVolume());
        // pakai constructor
        Bola bola2= new Bola(7);
        bola2.computeAndSetVolume();
        System.out.println("Volume bola 2 (constructor) : " + bola2.getVolume() + "\n");
    }
}
