package BelajarClass;



public class Square {
    int sisi;

   public void setSisi(int sisi){
    this.sisi = sisi;
   }

   public int getSisi(){
    return this.sisi;
   }

   public int getLuas(){
    return sisi*sisi;
   }

   public int getKeliling(){
    return sisi*4;
   }
   
}
