public class App {
    public static void main(String[] args) throws Exception {
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(5);
        kubus1.computeAndSetVolume();
        System.out.println("Volume kubus1 : " + kubus1.getVolume() + "\n");

        System.out.println("======================================");
        Balok balok1 = new Balok();
        balok1.setPanjang(5);
        balok1.setLebar(3);
        balok1.setTinggi(7);
        balok1.computeAndSetVolume();
        System.out.println("Volume balok1 : " + balok1.getVolume() + "\n");

        System.out.println("======================================");
        Tabung tabung1 = new Tabung();
        tabung1.setRadius(5);
        tabung1.setTinggi(10);
        tabung1.computeAndSetVolume();
        System.out.println("Volume tabung : " + tabung1.getVolume() + "\n");

        System.out.println("======================================");
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        limasSegiEmpat1.setSisi(10);
        limasSegiEmpat1.setTinggi(8);
        limasSegiEmpat1.computeAndSetVolume();
        System.out.println("Volume limas Segi Empat : " + limasSegiEmpat1.getVolume() + "\n" );

        System.out.println("======================================");
        Bola bola1= new Bola();
        bola1.setRadius(7);
        bola1.computeAndSetVolume();
        System.out.println("Volume bola : " + bola1.getVolume() + "\n");
    }
}
