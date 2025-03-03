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
    public void setPanjang( int panjang){
        this.panjang = panjang;
    }
    public void setLebar( int lebar){
        this.lebar = lebar;
    }
    public void setTinggi( int tinggi){
        this.tinggi = tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume =  panjang * lebar * tinggi;
    }
    public double getVolume(){
        return volume;
    }
}
