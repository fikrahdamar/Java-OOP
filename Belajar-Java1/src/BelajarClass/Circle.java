package BelajarClass;

public class Circle {
    int jari;

    public void setJari(int jari){
     this.jari = jari;
    }
 
    public int getJari(){
     return this.jari;
    }
 
    public double getLuas(){
     return 3.14*jari*jari;
    }
 
    public double getKeliling(){
     return 3.14*(jari*2);
    }
}
