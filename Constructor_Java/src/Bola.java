public class Bola {
    int radius;
    double volume;


    Bola(){

    }
    Bola(int radius) {
        this.radius = radius;
    }
    // public void setRadius(int radius){
    //     this.radius = radius;
    // }
    public void computeAndSetVolume(){
        this.volume = ((4.0/3) * Math.PI * radius * radius * radius);
    }
    public double getVolume(){
        return volume;
    }
}
