public class Tabung {
    int radius;
    int tinggi;
    double volume;

    public void setRadius ( int radius){
        this.radius = radius;
    }
    public void setTinggi ( int tinggi){
        this.tinggi = tinggi;
    }
    public void computeAndSetVolume (){
        this.volume = (Math.PI * radius *  radius * tinggi);
    }
    public double getVolume(){
        return volume;
    }
}
