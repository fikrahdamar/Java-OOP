public class App {
    public static void main(String[] args) throws Exception {

        Kubus[] kubusArray = new Kubus[5];
        kubusArray[0] = new Kubus(3);
        kubusArray[1] = new Kubus(4);
        kubusArray[2] = new Kubus(5);
        kubusArray[3] = new Kubus(10);
        kubusArray[4] = new Kubus(12);
        
        for (Kubus loopKubus : kubusArray){
            loopKubus.computeAndSetVolume();
        }

        int indexKubus = 1;
        for (Kubus loopKubus : kubusArray){
            System.out.println("Volume Kubus ke-" + indexKubus + " adalah : " + loopKubus.getVolume() );
            indexKubus ++ ;
        }
        double totalVolumeKubus = 0;
        for (Kubus loopKubus : kubusArray){
            totalVolumeKubus += loopKubus.getVolume();

        }
        double rataVolumeKubus =  totalVolumeKubus / kubusArray.length;
        System.out.println("Volume rata - rata kubus  : " + rataVolumeKubus + "\n");


        System.out.println("======================================");
        Balok[] balokArray = new Balok[5];
        balokArray[0] = new Balok(5, 2, 4);
        balokArray[1] = new Balok(7, 5, 4);
        balokArray[2] = new Balok(8, 6, 2);
        balokArray[3] = new Balok(10, 8, 3);
        balokArray[4] = new Balok(4, 9, 1);
        
    
        for (Balok loopBalok : balokArray){
            loopBalok.computeAndSetVolume();
        }
        int indexBalok = 1;
        for (Balok loopBalok : balokArray){
            System.out.println("Volume Balok ke-" + indexBalok + " adalah : " + loopBalok.getVolume() );
            indexBalok ++ ;
        }
        
        double totalVolumeBalok = 0;
        for (Balok loopBalok : balokArray){
            totalVolumeBalok += loopBalok.getVolume();
        }
        double rataVolumeBalok = totalVolumeBalok / balokArray.length;
        System.out.println("Volume rata - rata balok  : " + rataVolumeBalok + "\n");


        System.out.println("======================================");
        Tabung[] tabungArray = new Tabung[5];
        tabungArray[0] = new Tabung(7, 10);
        tabungArray[1] = new Tabung(14, 5);
        tabungArray[2] = new Tabung(7, 8);
        tabungArray[3] = new Tabung(21, 3);
        tabungArray[4] = new Tabung(14, 13);

        for (Tabung loopTabung : tabungArray){
            loopTabung.computeAndSetVolume();
        }

        int indexTabung = 0;
        for (Tabung loopTabung : tabungArray){
            System.out.println("Volume Tabung ke-" + indexTabung + " adalah : " + loopTabung.getVolume() );
            indexTabung ++ ;
        }

        double totalVolumeTabung = 0;
        for (Tabung loopTabung : tabungArray){
            totalVolumeTabung += loopTabung.getVolume();
        }
        double rataVolumeTabung = totalVolumeTabung / tabungArray.length;
        System.out.println("Volume rata - rata tabung  : " + rataVolumeTabung + "\n");



        System.out.println("======================================");
        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[5];
        limasArray[0] = new LimasSegiEmpat(5, 10);
        limasArray[1] = new LimasSegiEmpat(8, 7);
        limasArray[2] = new LimasSegiEmpat(3, 8);
        limasArray[3] = new LimasSegiEmpat(10, 13);
        limasArray[4] = new LimasSegiEmpat(8, 6);
        
        for (LimasSegiEmpat loopLimas : limasArray){
            loopLimas.computeAndSetVolume();
        }

        int indexLimas = 1;
        for (LimasSegiEmpat loopLimas : limasArray){
            System.out.println("Volume limas segi empat ke-" + indexLimas + " adalah : " + loopLimas.getVolume() );
            indexLimas++;
        }

        double totalVolumeLimas = 0;
        for (LimasSegiEmpat loopLimas : limasArray){
            totalVolumeLimas += loopLimas.getVolume();
        }
        double rataVolumeLimas = totalVolumeLimas / limasArray.length;
        System.out.println("Volume rata - rata limas segi empat  : " + rataVolumeLimas + "\n");


        System.out.println("======================================");
        Bola[] bolaArray = new Bola[5];
        bolaArray[0] = new Bola(7);
        bolaArray[1] = new Bola(10);
        bolaArray[2] = new Bola(5);
        bolaArray[3] = new Bola(9);
        bolaArray[4] = new Bola(14);

        for (Bola loopBola : bolaArray){
            loopBola.computeAndSetVolume();
        }
        int indexBola = 1;
        for (Bola loopBola : bolaArray ){
            System.out.println("Volume Bola ke-" + indexBola + " adalah : " + loopBola.getVolume() );
            indexBalok++;            
        }

        double totalVolumeBola = 0;
        for (Bola loopBola : bolaArray){
            totalVolumeBola += loopBola.getVolume();
        }
        double rataVolumeBola = totalVolumeBola / bolaArray.length;
        System.out.println("Volume rata - rata bola  : " + rataVolumeBola + "\n");
    }
}
