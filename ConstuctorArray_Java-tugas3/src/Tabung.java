public class Tabung {
    int radius;
    int tinggi;
    double volume;


    Tabung(){

    }
    Tabung(int radius, int tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
   
    public void computeAndSetVolume (){
        this.volume = (Math.PI * radius *  radius * tinggi);
    }
    public double getVolume(){
        return volume;
    }
}
