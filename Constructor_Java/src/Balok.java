public class Balok {
    int panjang;
    int lebar;
    int tinggi;
    double volume;

    Balok (){
        
    }
    
    Balok (int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
  
    public void computeAndSetVolume(){
        this.volume =  panjang * lebar * tinggi;
    }
    public double getVolume(){
        return volume;
    }
}
