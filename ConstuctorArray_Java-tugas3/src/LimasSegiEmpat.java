public class LimasSegiEmpat {
    int sisi;
    int tinggi;
    double volume;


    LimasSegiEmpat(){

    }
    LimasSegiEmpat(int sisi, int tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
   
    public void computeAndSetVolume(){
        this.volume = ((1.0/3) * (sisi * sisi * tinggi));
    }
    public double getVolume(){
        return volume;
    }
}
