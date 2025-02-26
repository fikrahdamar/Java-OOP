public class LimasSegiEmpat {
    int sisi;
    int tinggi;
    double volume;

    public void setSisi( int sisi){
        this.sisi = sisi;
    }
    public void setTinggi ( int tinggi){
        this.tinggi = tinggi;
    }
    public void computeAndSetVolume(){
        this.volume = (1/3 * sisi * sisi * tinggi);
    }
    public double getVolume(){
        return volume;
    }
}
