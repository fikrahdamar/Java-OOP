package BelajarClass;

public class Rectangle {
    int panjang;
    int lebar;

    public void setPanjangLebar(int panjang, int lebar){
     this.panjang = panjang;
     this.lebar = lebar;
    }
 
    public int getPanjang(){
     return this.panjang;
    }

    public int getLebar(){
        return this.lebar;
    }
 
    public int getLuas(){
     return panjang*lebar;
    }
 
    public int getKeliling(){
     return 2*(panjang + lebar);
    }
}
