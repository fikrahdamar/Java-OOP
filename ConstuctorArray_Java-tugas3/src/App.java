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
        // tabung
        Tabung[] tabungArray = new Tabung[5];
        tabungArray[0] = new Tabung(7, 10);
        tabungArray[1] = new Tabung(14, 5);
        tabungArray[2] = new Tabung(7, 8);
        tabungArray[3] = new Tabung(21, 3);
        tabungArray[4] = new Tabung(14, 13);

        for (Tabung loopTabung : tabungArray){
            loopTabung.computeAndSetVolume();
        }



        System.out.println("======================================");
        // limas
        System.out.println("======================================");
    //    bola
    }
}
